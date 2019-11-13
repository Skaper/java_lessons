char outputData = ' ';

void setup()
{
  Serial.begin(115200);
}

void loop()
{
  if (digitalRead(BTN_UP)==LOW)
  {
    outputData = 'U';
  }
  else if (digitalRead(BTN_DOWN)==LOW)
  {
     outputData = 'D';
  }
  else if (digitalRead(BTN_LEFT)==LOW)
  {
     outputData = 'L';
  }
  else if (digitalRead(BTN_RIGHT)==LOW)
  {
     outputData = 'R';
  }
  else if (digitalRead(BTN_CENTER)==LOW)
  {
     outputData = 'C';
  }
  else{
     outputData = 'N';
  }
  Serial.println(outputData);
  delay(50);
}


