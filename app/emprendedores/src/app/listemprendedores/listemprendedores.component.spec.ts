import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListemprendedoresComponent } from './listemprendedores.component';

describe('ListemprendedoresComponent', () => {
  let component: ListemprendedoresComponent;
  let fixture: ComponentFixture<ListemprendedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListemprendedoresComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListemprendedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
