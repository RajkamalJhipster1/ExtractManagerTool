import { Moment } from 'moment';
import { IExtractOrganisation } from 'app/shared/model/extract-organisation.model';
import { IExtractParts } from 'app/shared/model/extract-parts.model';
import { IExtractDetails } from 'app/shared/model/extract-details.model';
import { IExtractOrganisationAudit } from 'app/shared/model/extract-organisation-audit.model';
import { IExtractAudit } from 'app/shared/model/extract-audit.model';

export interface IExtractConfig {
    id?: number;
    extractname?: string;
    type?: string;
    requestingorg?: string;
    active?: boolean;
    deleted?: boolean;
    emailContact?: string;
    createdDate?: Moment;
    extractids?: IExtractOrganisation[];
    extractids?: IExtractParts[];
    extractids?: IExtractDetails[];
    extractids?: IExtractOrganisationAudit[];
    extractids?: IExtractAudit[];
}

export class ExtractConfig implements IExtractConfig {
    constructor(
        public id?: number,
        public extractname?: string,
        public type?: string,
        public requestingorg?: string,
        public active?: boolean,
        public deleted?: boolean,
        public emailContact?: string,
        public createdDate?: Moment,
        public extractids?: IExtractOrganisation[],
        public extractids?: IExtractParts[],
        public extractids?: IExtractDetails[],
        public extractids?: IExtractOrganisationAudit[],
        public extractids?: IExtractAudit[]
    ) {
        this.active = this.active || false;
        this.deleted = this.deleted || false;
    }
}
