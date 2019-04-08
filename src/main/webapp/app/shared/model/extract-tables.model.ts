import { IExtractParts } from 'app/shared/model/extract-parts.model';
import { IExtractAudit } from 'app/shared/model/extract-audit.model';

export interface IExtractTables {
    id?: number;
    tablename?: string;
    isExtractable?: boolean;
    extractParts?: IExtractParts[];
    extractAudits?: IExtractAudit[];
}

export class ExtractTables implements IExtractTables {
    constructor(
        public id?: number,
        public tablename?: string,
        public isExtractable?: boolean,
        public extractParts?: IExtractParts[],
        public extractAudits?: IExtractAudit[]
    ) {
        this.isExtractable = this.isExtractable || false;
    }
}
