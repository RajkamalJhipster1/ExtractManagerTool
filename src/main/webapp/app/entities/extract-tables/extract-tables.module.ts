import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ExtractManagerToolSharedModule } from 'app/shared';
import {
    ExtractTablesComponent,
    ExtractTablesDetailComponent,
    ExtractTablesUpdateComponent,
    ExtractTablesDeletePopupComponent,
    ExtractTablesDeleteDialogComponent,
    extractTablesRoute,
    extractTablesPopupRoute
} from './';

const ENTITY_STATES = [...extractTablesRoute, ...extractTablesPopupRoute];

@NgModule({
    imports: [ExtractManagerToolSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        ExtractTablesComponent,
        ExtractTablesDetailComponent,
        ExtractTablesUpdateComponent,
        ExtractTablesDeleteDialogComponent,
        ExtractTablesDeletePopupComponent
    ],
    entryComponents: [
        ExtractTablesComponent,
        ExtractTablesUpdateComponent,
        ExtractTablesDeleteDialogComponent,
        ExtractTablesDeletePopupComponent
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ExtractManagerToolExtractTablesModule {}
