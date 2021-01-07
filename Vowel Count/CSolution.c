#include <stddef.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <stdio.h>

size_t get_count(const char *s)
{
  if (*s == '\0'){
    return 0;
  }
  else{
    char *list = malloc(6 * sizeof(char)); strcpy(list, "aeiou");
    size_t count = 0; //Don't know what the maximum string size is so lol
    while(*s != '\0'){
      if (*list == tolower(*s)){ count++; *s++; continue; }
      else if (*(list + 1) == tolower(*s)){ count++; *s++; continue; }
      else if (*(list + 2) == tolower(*s)){ count++; *s++; continue; }
      else if (*(list + 3) == tolower(*s)){ count++; *s++; continue; }
      else if (*(list + 4) == tolower(*s)){ count++; *s++; continue; }
      *s++;
    }
    free(list); list = NULL;
    return count;
  }
}