import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LeaveManagmentComponent } from './leave-managment/leave-managment.component';
import { LeaveCardSelfComponent } from './leave-card-self/leave-card-self.component';
@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LeaveManagmentComponent,
    LeaveCardSelfComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
