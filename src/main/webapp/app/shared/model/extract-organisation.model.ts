import { Moment } from 'moment';
import { IOrganisation } from 'app/shared/model/organisation.model';
import { IExtractConfig } from 'app/shared/model/extract-config.model';

export interface IExtractOrganisation {
    id?: number;
    organisationName?: string;
    deleted?: boolean;
    disabled?: boolean;
    isActive?: boolean;
    modifiedDate?: Moment;
    createdDate?: Moment;
    organisation?: IOrganisation;
    extractConfig?: IExtractConfig;
}

export class ExtractOrganisation implements IExtractOrganisation {
    constructor(
        public id?: number,
        public organisationName?: string,
        public deleted?: boolean,
        public disabled?: boolean,
        public isActive?: boolean,
        public modifiedDate?: Moment,
        public createdDate?: Moment,
        public organisation?: IOrganisation,
        public extractConfig?: IExtractConfig
    ) {
        this.deleted = this.deleted || false;
        this.disabled = this.disabled || false;
        this.isActive = this.isActive || false;
    }
}
