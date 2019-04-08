import { Moment } from 'moment';
import { IOrganisation } from 'app/shared/model/organisation.model';
import { IExtractAudit } from 'app/shared/model/extract-audit.model';

export interface IExtractOrganisationAudit {
    id?: number;
    firstExtractPoint?: string;
    lastExtractPoint?: string;
    createdDate?: Moment;
    success?: boolean;
    organisation?: IOrganisation;
    extractAudit?: IExtractAudit;
}

export class ExtractOrganisationAudit implements IExtractOrganisationAudit {
    constructor(
        public id?: number,
        public firstExtractPoint?: string,
        public lastExtractPoint?: string,
        public createdDate?: Moment,
        public success?: boolean,
        public organisation?: IOrganisation,
        public extractAudit?: IExtractAudit
    ) {
        this.success = this.success || false;
    }
}
