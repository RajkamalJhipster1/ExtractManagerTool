import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ExtractManagerToolSharedModule } from 'app/shared';
import {
    ExtractDetailsComponent,
    ExtractDetailsDetailComponent,
    ExtractDetailsUpdateComponent,
    ExtractDetailsDeletePopupComponent,
    ExtractDetailsDeleteDialogComponent,
    extractDetailsRoute,
    extractDetailsPopupRoute
} from './';

const ENTITY_STATES = [...extractDetailsRoute, ...extractDetailsPopupRoute];

@NgModule({
    imports: [ExtractManagerToolSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        ExtractDetailsComponent,
        ExtractDetailsDetailComponent,
        ExtractDetailsUpdateComponent,
        ExtractDetailsDeleteDialogComponent,
        ExtractDetailsDeletePopupComponent
    ],
    entryComponents: [
        ExtractDetailsComponent,
        ExtractDetailsUpdateComponent,
        ExtractDetailsDeleteDialogComponent,
        ExtractDetailsDeletePopupComponent
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ExtractManagerToolExtractDetailsModule {}
