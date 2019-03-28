import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ExtractManagerToolSharedModule } from 'app/shared';
import {
    ExtractPartsComponent,
    ExtractPartsDetailComponent,
    ExtractPartsUpdateComponent,
    ExtractPartsDeletePopupComponent,
    ExtractPartsDeleteDialogComponent,
    extractPartsRoute,
    extractPartsPopupRoute
} from './';

const ENTITY_STATES = [...extractPartsRoute, ...extractPartsPopupRoute];

@NgModule({
    imports: [ExtractManagerToolSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        ExtractPartsComponent,
        ExtractPartsDetailComponent,
        ExtractPartsUpdateComponent,
        ExtractPartsDeleteDialogComponent,
        ExtractPartsDeletePopupComponent
    ],
    entryComponents: [
        ExtractPartsComponent,
        ExtractPartsUpdateComponent,
        ExtractPartsDeleteDialogComponent,
        ExtractPartsDeletePopupComponent
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ExtractManagerToolExtractPartsModule {}
