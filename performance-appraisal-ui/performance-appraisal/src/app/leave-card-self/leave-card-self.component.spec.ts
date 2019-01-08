import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LeaveCardSelfComponent } from './leave-card-self.component';

describe('LeaveCardSelfComponent', () => {
  let component: LeaveCardSelfComponent;
  let fixture: ComponentFixture<LeaveCardSelfComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LeaveCardSelfComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LeaveCardSelfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
