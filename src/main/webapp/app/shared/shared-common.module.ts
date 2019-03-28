import { NgModule } from '@angular/core';

import { ExtractManagerToolSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [ExtractManagerToolSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [ExtractManagerToolSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class ExtractManagerToolSharedCommonModule {}
