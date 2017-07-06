#pragma once

struct sterling
{
	int pounds;
	int shillings;
	int pence;
};

sterling make_sterling(int pounds, int shillings, int pence);

sterling make_sterling(int pence);

sterling add(sterling x, sterling y);

void print(sterling& a);

void read(sterling* b);