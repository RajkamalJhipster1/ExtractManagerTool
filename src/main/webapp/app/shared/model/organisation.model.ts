import { IExtractOrganisation } from 'app/shared/model/extract-organisation.model';
import { IExtractOrganisationAudit } from 'app/shared/model/extract-organisation-audit.model';

export interface IOrganisation {
    id?: number;
    cDB?: number;
    organisationName?: string;
    nationalPracticeCode?: string;
    active?: boolean;
    organisationids?: IExtractOrganisation[];
    organisationids?: IExtractOrganisationAudit[];
}

export class Organisation implements IOrganisation {
    constructor(
        public id?: number,
        public cDB?: number,
        public organisationName?: string,
        public nationalPracticeCode?: string,
        public active?: boolean,
        public organisationids?: IExtractOrganisation[],
        public organisationids?: IExtractOrganisationAudit[]
    ) {
        this.active = this.active || false;
    }
}
