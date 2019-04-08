import { Moment } from 'moment';
import { IExtractOrganisation } from 'app/shared/model/extract-organisation.model';
import { IExtractParts } from 'app/shared/model/extract-parts.model';
import { IExtractDetails } from 'app/shared/model/extract-details.model';
import { IExtractAudit } from 'app/shared/model/extract-audit.model';

export interface IExtractConfig {
    id?: number;
    extractname?: string;
    type?: string;
    requestingorg?: string;
    active?: boolean;
    deleted?: boolean;
    disabled?: boolean;
    emailContact?: string;
    createdDate?: Moment;
    extractOrganisations?: IExtractOrganisation[];
    extractParts?: IExtractParts[];
    extractDetails?: IExtractDetails[];
    extractAudits?: IExtractAudit[];
}

export class ExtractConfig implements IExtractConfig {
    constructor(
        public id?: number,
        public extractname?: string,
        public type?: string,
        public requestingorg?: string,
        public active?: boolean,
        public deleted?: boolean,
        public disabled?: boolean,
        public emailContact?: string,
        public createdDate?: Moment,
        public extractOrganisations?: IExtractOrganisation[],
        public extractParts?: IExtractParts[],
        public extractDetails?: IExtractDetails[],
        public extractAudits?: IExtractAudit[]
    ) {
        this.active = this.active || false;
        this.deleted = this.deleted || false;
        this.disabled = this.disabled || false;
    }
}
