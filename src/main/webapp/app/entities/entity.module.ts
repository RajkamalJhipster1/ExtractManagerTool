import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'organisation',
                loadChildren: './organisation/organisation.module#ExtractManagerToolOrganisationModule'
            },
            {
                path: 'extract-config',
                loadChildren: './extract-config/extract-config.module#ExtractManagerToolExtractConfigModule'
            },
            {
                path: 'extract-organisation',
                loadChildren: './extract-organisation/extract-organisation.module#ExtractManagerToolExtractOrganisationModule'
            },
            {
                path: 'extract-parts',
                loadChildren: './extract-parts/extract-parts.module#ExtractManagerToolExtractPartsModule'
            },
            {
                path: 'extract-details',
                loadChildren: './extract-details/extract-details.module#ExtractManagerToolExtractDetailsModule'
            },
            {
                path: 'extract-tables',
                loadChildren: './extract-tables/extract-tables.module#ExtractManagerToolExtractTablesModule'
            },
            {
                path: 'extract-organisation-audit',
                loadChildren:
                    './extract-organisation-audit/extract-organisation-audit.module#ExtractManagerToolExtractOrganisationAuditModule'
            },
            {
                path: 'extract-audit',
                loadChildren: './extract-audit/extract-audit.module#ExtractManagerToolExtractAuditModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ExtractManagerToolEntityModule {}
