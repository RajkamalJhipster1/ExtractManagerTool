import { IExtractParts } from 'app/shared/model/extract-parts.model';
import { IExtractOrganisationAudit } from 'app/shared/model/extract-organisation-audit.model';
import { IExtractAudit } from 'app/shared/model/extract-audit.model';

export interface IExtractTables {
    id?: number;
    tablename?: string;
    isExtractable?: boolean;
    extractTableids?: IExtractParts[];
    extractTableids?: IExtractOrganisationAudit[];
    extractTableids?: IExtractAudit[];
}

export class ExtractTables implements IExtractTables {
    constructor(
        public id?: number,
        public tablename?: string,
        public isExtractable?: boolean,
        public extractTableids?: IExtractParts[],
        public extractTableids?: IExtractOrganisationAudit[],
        public extractTableids?: IExtractAudit[]
    ) {
        this.isExtractable = this.isExtractable || false;
    }
}
