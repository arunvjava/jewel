import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './components/views/login/login.component';
import { RegistrationComponent } from './components/views/registration/registration.component';
import { HomeComponent } from './components/views/home/home.component';
import { TopNavbarComponent } from './components/shared/top-navbar/top-navbar.component';
import { FooterComponent } from './components/shared/footer/footer.component';
import { TopMenubarComponent } from './components/shared/top-menubar/top-menubar.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
    TopNavbarComponent,
    FooterComponent,
    TopMenubarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
