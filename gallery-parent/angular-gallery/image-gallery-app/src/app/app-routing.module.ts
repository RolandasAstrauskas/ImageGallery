import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { GridImageComponent } from './grid-image/grid-image.component';
import { HeaderComponent } from './header/header.component';


const routes: Routes = [
  { path: 'image', component: GridImageComponent },
  { path: 'head', component: HeaderComponent },
];

@NgModule({
 imports: [RouterModule.forRoot(routes)],
   exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [GridImageComponent, HeaderComponent];
