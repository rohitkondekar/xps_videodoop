package fastcornerdetector;

import java.util.LinkedList;
import java.util.List;

public class Fast_9 
{

public final static int[] fast9_score(int[] i, int stride, XY[] corners, int num_corners, int b)
{	
	int[] scores = new int[num_corners];
	int n;
    int offset_pointer;
	int[] pixel=new int[16];
	make_offsets(pixel, stride);

    for(n=0; n < num_corners; n++){
        offset_pointer= corners[n].y*stride + corners[n].x;
        scores[n] = fast9_corner_score(i,offset_pointer, pixel, b);
    }

	return scores;
}
	

public final static void make_offsets(int pixel[], int row_stride)
{
        pixel[0] = 0 + row_stride * 3;
        pixel[1] = 1 + row_stride * 3;
        pixel[2] = 2 + row_stride * 2;
        pixel[3] = 3 + row_stride * 1;
        pixel[4] = 3 + row_stride * 0;
        pixel[5] = 3 + row_stride * -1;
        pixel[6] = 2 + row_stride * -2;
        pixel[7] = 1 + row_stride * -3;
        pixel[8] = 0 + row_stride * -3;
        pixel[9] = -1 + row_stride * -3;
        pixel[10] = -2 + row_stride * -2;
        pixel[11] = -3 + row_stride * -1;
        pixel[12] = -3 + row_stride * 0;
        pixel[13] = -3 + row_stride * 1;
        pixel[14] = -2 + row_stride * 2;
        pixel[15] = -1 + row_stride * 3;
}

public void test()
{
    bla:
    {
        int a=5;
    if (a>9)
        break bla;

    }
}


public final static int fast9_corner_score(final  int[] p,int offset_pointer, int pixel[], int bstart)
{
    int bmin = bstart;
    int bmax = 255;
    int b = (bmax + bmin)/2;

    /*Compute the score using binary search*/
    //if(bmin == bmax - 1 || bmin == bmax) => return
    while(!(bmin == bmax - 1 || bmin == bmax))
    {
		//int cb = *p + b;
		//int c_b= *p - b;
//        int cb=p[offset_pointer+b];
//        int c_b=p[offset_pointer-b];

        int cb=p[offset_pointer]+b;
            int c_b=p[offset_pointer]-b;

        b = (bmin + bmax) / 2;


        int p_off_0=p[offset_pointer+pixel[0]];
            int p_off_1=p[offset_pointer+pixel[1]];
            int p_off_2=p[offset_pointer+pixel[2]];
            int p_off_3=p[offset_pointer+pixel[3]];
            int p_off_4=p[offset_pointer+pixel[4]];
            int p_off_5=p[offset_pointer+pixel[5]];
            int p_off_6=p[offset_pointer+pixel[6]];
            int p_off_7=p[offset_pointer+pixel[7]];
            int p_off_8=p[offset_pointer+pixel[8]];
            int p_off_9=p[offset_pointer+pixel[9]];
            int p_off_10=p[offset_pointer+pixel[10]];
            int p_off_11=p[offset_pointer+pixel[11]];
            int p_off_12=p[offset_pointer+pixel[12]];
            int p_off_13=p[offset_pointer+pixel[13]];
            int p_off_14=p[offset_pointer+pixel[14]];
            int p_off_15=p[offset_pointer+pixel[15]];


        if( p_off_0 > cb)
         if( p_off_1 > cb)
          if( p_off_2 > cb)
           if( p_off_3 > cb)
            if( p_off_4 > cb)
             if( p_off_5 > cb)
              if( p_off_6 > cb)
               if( p_off_7 > cb)
                if( p_off_8 > cb)
                 {bmin=b;continue;}
                else
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
               else if( p_off_7 < c_b)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else if( p_off_14 < c_b)
                 if( p_off_8 < c_b)
                  if( p_off_9 < c_b)
                   if( p_off_10 < c_b)
                    if( p_off_11 < c_b)
                     if( p_off_12 < c_b)
                      if( p_off_13 < c_b)
                       if( p_off_15 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else if( p_off_6 < c_b)
               if( p_off_15 > cb)
                if( p_off_13 > cb)
                 if( p_off_14 > cb)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else if( p_off_13 < c_b)
                 if( p_off_7 < c_b)
                  if( p_off_8 < c_b)
                   if( p_off_9 < c_b)
                    if( p_off_10 < c_b)
                     if( p_off_11 < c_b)
                      if( p_off_12 < c_b)
                       if( p_off_14 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                if( p_off_7 < c_b)
                 if( p_off_8 < c_b)
                  if( p_off_9 < c_b)
                   if( p_off_10 < c_b)
                    if( p_off_11 < c_b)
                     if( p_off_12 < c_b)
                      if( p_off_13 < c_b)
                       if( p_off_14 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else if( p_off_13 < c_b)
                if( p_off_7 < c_b)
                 if( p_off_8 < c_b)
                  if( p_off_9 < c_b)
                   if( p_off_10 < c_b)
                    if( p_off_11 < c_b)
                     if( p_off_12 < c_b)
                      if( p_off_14 < c_b)
                       if( p_off_15 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else if( p_off_5 < c_b)
              if( p_off_14 > cb)
               if( p_off_12 > cb)
                if( p_off_13 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      if( p_off_10 > cb)
                       if( p_off_11 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else if( p_off_12 < c_b)
                if( p_off_6 < c_b)
                 if( p_off_7 < c_b)
                  if( p_off_8 < c_b)
                   if( p_off_9 < c_b)
                    if( p_off_10 < c_b)
                     if( p_off_11 < c_b)
                      if( p_off_13 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else if( p_off_14 < c_b)
               if( p_off_7 < c_b)
                if( p_off_8 < c_b)
                 if( p_off_9 < c_b)
                  if( p_off_10 < c_b)
                   if( p_off_11 < c_b)
                    if( p_off_12 < c_b)
                     if( p_off_13 < c_b)
                      if( p_off_6 < c_b)
                       {bmin=b;continue;}
                      else
                       if( p_off_15 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               if( p_off_6 < c_b)
                if( p_off_7 < c_b)
                 if( p_off_8 < c_b)
                  if( p_off_9 < c_b)
                   if( p_off_10 < c_b)
                    if( p_off_11 < c_b)
                     if( p_off_12 < c_b)
                      if( p_off_13 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      if( p_off_10 > cb)
                       if( p_off_11 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else if( p_off_12 < c_b)
               if( p_off_7 < c_b)
                if( p_off_8 < c_b)
                 if( p_off_9 < c_b)
                  if( p_off_10 < c_b)
                   if( p_off_11 < c_b)
                    if( p_off_13 < c_b)
                     if( p_off_14 < c_b)
                      if( p_off_6 < c_b)
                       {bmin=b;continue;}
                      else
                       if( p_off_15 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else if( p_off_4 < c_b)
             if( p_off_13 > cb)
              if( p_off_11 > cb)
               if( p_off_12 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      if( p_off_10 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      if( p_off_10 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else if( p_off_11 < c_b)
               if( p_off_5 < c_b)
                if( p_off_6 < c_b)
                 if( p_off_7 < c_b)
                  if( p_off_8 < c_b)
                   if( p_off_9 < c_b)
                    if( p_off_10 < c_b)
                     if( p_off_12 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else if( p_off_13 < c_b)
              if( p_off_7 < c_b)
               if( p_off_8 < c_b)
                if( p_off_9 < c_b)
                 if( p_off_10 < c_b)
                  if( p_off_11 < c_b)
                   if( p_off_12 < c_b)
                    if( p_off_6 < c_b)
                     if( p_off_5 < c_b)
                      {bmin=b;continue;}
                     else
                      if( p_off_14 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                    else
                     if( p_off_14 < c_b)
                      if( p_off_15 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              if( p_off_5 < c_b)
               if( p_off_6 < c_b)
                if( p_off_7 < c_b)
                 if( p_off_8 < c_b)
                  if( p_off_9 < c_b)
                   if( p_off_10 < c_b)
                    if( p_off_11 < c_b)
                     if( p_off_12 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      if( p_off_10 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      if( p_off_10 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else if( p_off_11 < c_b)
              if( p_off_7 < c_b)
               if( p_off_8 < c_b)
                if( p_off_9 < c_b)
                 if( p_off_10 < c_b)
                  if( p_off_12 < c_b)
                   if( p_off_13 < c_b)
                    if( p_off_6 < c_b)
                     if( p_off_5 < c_b)
                      {bmin=b;continue;}
                     else
                      if( p_off_14 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                    else
                     if( p_off_14 < c_b)
                      if( p_off_15 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
           else if( p_off_3 < c_b)
            if( p_off_10 > cb)
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else if( p_off_10 < c_b)
             if( p_off_7 < c_b)
              if( p_off_8 < c_b)
               if( p_off_9 < c_b)
                if( p_off_11 < c_b)
                 if( p_off_6 < c_b)
                  if( p_off_5 < c_b)
                   if( p_off_4 < c_b)
                    {bmin=b;continue;}
                   else
                    if( p_off_12 < c_b)
                     if( p_off_13 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                  else
                   if( p_off_12 < c_b)
                    if( p_off_13 < c_b)
                     if( p_off_14 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_12 < c_b)
                   if( p_off_13 < c_b)
                    if( p_off_14 < c_b)
                     if( p_off_15 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            if( p_off_10 > cb)
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     if( p_off_9 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else if( p_off_10 < c_b)
             if( p_off_7 < c_b)
              if( p_off_8 < c_b)
               if( p_off_9 < c_b)
                if( p_off_11 < c_b)
                 if( p_off_12 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_5 < c_b)
                    if( p_off_4 < c_b)
                     {bmin=b;continue;}
                    else
                     if( p_off_13 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                   else
                    if( p_off_13 < c_b)
                     if( p_off_14 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                  else
                   if( p_off_13 < c_b)
                    if( p_off_14 < c_b)
                     if( p_off_15 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
          else if( p_off_2 < c_b)
           if( p_off_9 > cb)
            if( p_off_10 > cb)
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 > cb)
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else if( p_off_9 < c_b)
            if( p_off_7 < c_b)
             if( p_off_8 < c_b)
              if( p_off_10 < c_b)
               if( p_off_6 < c_b)
                if( p_off_5 < c_b)
                 if( p_off_4 < c_b)
                  if( p_off_3 < c_b)
                   {bmin=b;continue;}
                  else
                   if( p_off_11 < c_b)
                    if( p_off_12 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_11 < c_b)
                   if( p_off_12 < c_b)
                    if( p_off_13 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_11 < c_b)
                  if( p_off_12 < c_b)
                   if( p_off_13 < c_b)
                    if( p_off_14 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_11 < c_b)
                 if( p_off_12 < c_b)
                  if( p_off_13 < c_b)
                   if( p_off_14 < c_b)
                    if( p_off_15 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           if( p_off_9 > cb)
            if( p_off_10 > cb)
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 > cb)
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    if( p_off_8 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else if( p_off_9 < c_b)
            if( p_off_7 < c_b)
             if( p_off_8 < c_b)
              if( p_off_10 < c_b)
               if( p_off_11 < c_b)
                if( p_off_6 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_4 < c_b)
                   if( p_off_3 < c_b)
                    {bmin=b;continue;}
                   else
                    if( p_off_12 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                  else
                   if( p_off_12 < c_b)
                    if( p_off_13 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_12 < c_b)
                   if( p_off_13 < c_b)
                    if( p_off_14 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_12 < c_b)
                  if( p_off_13 < c_b)
                   if( p_off_14 < c_b)
                    if( p_off_15 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
         else if( p_off_1 < c_b)
          if( p_off_8 > cb)
           if( p_off_9 > cb)
            if( p_off_10 > cb)
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 > cb)
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_2 > cb)
               if( p_off_3 > cb)
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else if( p_off_8 < c_b)
           if( p_off_7 < c_b)
            if( p_off_9 < c_b)
             if( p_off_6 < c_b)
              if( p_off_5 < c_b)
               if( p_off_4 < c_b)
                if( p_off_3 < c_b)
                 if( p_off_2 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_10 < c_b)
                   if( p_off_11 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_10 < c_b)
                  if( p_off_11 < c_b)
                   if( p_off_12 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_10 < c_b)
                 if( p_off_11 < c_b)
                  if( p_off_12 < c_b)
                   if( p_off_13 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_10 < c_b)
                if( p_off_11 < c_b)
                 if( p_off_12 < c_b)
                  if( p_off_13 < c_b)
                   if( p_off_14 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_10 < c_b)
               if( p_off_11 < c_b)
                if( p_off_12 < c_b)
                 if( p_off_13 < c_b)
                  if( p_off_14 < c_b)
                   if( p_off_15 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           {bmax=b;continue;}
         else
          if( p_off_8 > cb)
           if( p_off_9 > cb)
            if( p_off_10 > cb)
             if( p_off_11 > cb)
              if( p_off_12 > cb)
               if( p_off_13 > cb)
                if( p_off_14 > cb)
                 if( p_off_15 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 > cb)
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_2 > cb)
               if( p_off_3 > cb)
                if( p_off_4 > cb)
                 if( p_off_5 > cb)
                  if( p_off_6 > cb)
                   if( p_off_7 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else if( p_off_8 < c_b)
           if( p_off_7 < c_b)
            if( p_off_9 < c_b)
             if( p_off_10 < c_b)
              if( p_off_6 < c_b)
               if( p_off_5 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_3 < c_b)
                  if( p_off_2 < c_b)
                   {bmin=b;continue;}
                  else
                   if( p_off_11 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_11 < c_b)
                   if( p_off_12 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_11 < c_b)
                  if( p_off_12 < c_b)
                   if( p_off_13 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_11 < c_b)
                 if( p_off_12 < c_b)
                  if( p_off_13 < c_b)
                   if( p_off_14 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_11 < c_b)
                if( p_off_12 < c_b)
                 if( p_off_13 < c_b)
                  if( p_off_14 < c_b)
                   if( p_off_15 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           {bmax=b;continue;}
        else if( p_off_0 < c_b)
         if( p_off_1 > cb)
          if( p_off_8 > cb)
           if( p_off_7 > cb)
            if( p_off_9 > cb)
             if( p_off_6 > cb)
              if( p_off_5 > cb)
               if( p_off_4 > cb)
                if( p_off_3 > cb)
                 if( p_off_2 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_10 > cb)
                   if( p_off_11 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_10 > cb)
                  if( p_off_11 > cb)
                   if( p_off_12 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_10 > cb)
                 if( p_off_11 > cb)
                  if( p_off_12 > cb)
                   if( p_off_13 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_10 > cb)
                if( p_off_11 > cb)
                 if( p_off_12 > cb)
                  if( p_off_13 > cb)
                   if( p_off_14 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_10 > cb)
               if( p_off_11 > cb)
                if( p_off_12 > cb)
                 if( p_off_13 > cb)
                  if( p_off_14 > cb)
                   if( p_off_15 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else if( p_off_8 < c_b)
           if( p_off_9 < c_b)
            if( p_off_10 < c_b)
             if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_2 < c_b)
               if( p_off_3 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           {bmax=b;continue;}
         else if( p_off_1 < c_b)
          if( p_off_2 > cb)
           if( p_off_9 > cb)
            if( p_off_7 > cb)
             if( p_off_8 > cb)
              if( p_off_10 > cb)
               if( p_off_6 > cb)
                if( p_off_5 > cb)
                 if( p_off_4 > cb)
                  if( p_off_3 > cb)
                   {bmin=b;continue;}
                  else
                   if( p_off_11 > cb)
                    if( p_off_12 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_11 > cb)
                   if( p_off_12 > cb)
                    if( p_off_13 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_11 > cb)
                  if( p_off_12 > cb)
                   if( p_off_13 > cb)
                    if( p_off_14 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_11 > cb)
                 if( p_off_12 > cb)
                  if( p_off_13 > cb)
                   if( p_off_14 > cb)
                    if( p_off_15 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else if( p_off_9 < c_b)
            if( p_off_10 < c_b)
             if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else if( p_off_2 < c_b)
           if( p_off_3 > cb)
            if( p_off_10 > cb)
             if( p_off_7 > cb)
              if( p_off_8 > cb)
               if( p_off_9 > cb)
                if( p_off_11 > cb)
                 if( p_off_6 > cb)
                  if( p_off_5 > cb)
                   if( p_off_4 > cb)
                    {bmin=b;continue;}
                   else
                    if( p_off_12 > cb)
                     if( p_off_13 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                  else
                   if( p_off_12 > cb)
                    if( p_off_13 > cb)
                     if( p_off_14 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_12 > cb)
                   if( p_off_13 > cb)
                    if( p_off_14 > cb)
                     if( p_off_15 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else if( p_off_10 < c_b)
             if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else if( p_off_3 < c_b)
            if( p_off_4 > cb)
             if( p_off_13 > cb)
              if( p_off_7 > cb)
               if( p_off_8 > cb)
                if( p_off_9 > cb)
                 if( p_off_10 > cb)
                  if( p_off_11 > cb)
                   if( p_off_12 > cb)
                    if( p_off_6 > cb)
                     if( p_off_5 > cb)
                      {bmin=b;continue;}
                     else
                      if( p_off_14 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                    else
                     if( p_off_14 > cb)
                      if( p_off_15 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else if( p_off_13 < c_b)
              if( p_off_11 > cb)
               if( p_off_5 > cb)
                if( p_off_6 > cb)
                 if( p_off_7 > cb)
                  if( p_off_8 > cb)
                   if( p_off_9 > cb)
                    if( p_off_10 > cb)
                     if( p_off_12 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else if( p_off_11 < c_b)
               if( p_off_12 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      if( p_off_10 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      if( p_off_10 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              if( p_off_5 > cb)
               if( p_off_6 > cb)
                if( p_off_7 > cb)
                 if( p_off_8 > cb)
                  if( p_off_9 > cb)
                   if( p_off_10 > cb)
                    if( p_off_11 > cb)
                     if( p_off_12 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else if( p_off_4 < c_b)
             if( p_off_5 > cb)
              if( p_off_14 > cb)
               if( p_off_7 > cb)
                if( p_off_8 > cb)
                 if( p_off_9 > cb)
                  if( p_off_10 > cb)
                   if( p_off_11 > cb)
                    if( p_off_12 > cb)
                     if( p_off_13 > cb)
                      if( p_off_6 > cb)
                       {bmin=b;continue;}
                      else
                       if( p_off_15 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else if( p_off_14 < c_b)
               if( p_off_12 > cb)
                if( p_off_6 > cb)
                 if( p_off_7 > cb)
                  if( p_off_8 > cb)
                   if( p_off_9 > cb)
                    if( p_off_10 > cb)
                     if( p_off_11 > cb)
                      if( p_off_13 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else if( p_off_12 < c_b)
                if( p_off_13 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      if( p_off_10 < c_b)
                       if( p_off_11 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               if( p_off_6 > cb)
                if( p_off_7 > cb)
                 if( p_off_8 > cb)
                  if( p_off_9 > cb)
                   if( p_off_10 > cb)
                    if( p_off_11 > cb)
                     if( p_off_12 > cb)
                      if( p_off_13 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else if( p_off_5 < c_b)
              if( p_off_6 > cb)
               if( p_off_15 < c_b)
                if( p_off_13 > cb)
                 if( p_off_7 > cb)
                  if( p_off_8 > cb)
                   if( p_off_9 > cb)
                    if( p_off_10 > cb)
                     if( p_off_11 > cb)
                      if( p_off_12 > cb)
                       if( p_off_14 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else if( p_off_13 < c_b)
                 if( p_off_14 < c_b)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                if( p_off_7 > cb)
                 if( p_off_8 > cb)
                  if( p_off_9 > cb)
                   if( p_off_10 > cb)
                    if( p_off_11 > cb)
                     if( p_off_12 > cb)
                      if( p_off_13 > cb)
                       if( p_off_14 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else if( p_off_6 < c_b)
               if( p_off_7 > cb)
                if( p_off_14 > cb)
                 if( p_off_8 > cb)
                  if( p_off_9 > cb)
                   if( p_off_10 > cb)
                    if( p_off_11 > cb)
                     if( p_off_12 > cb)
                      if( p_off_13 > cb)
                       if( p_off_15 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else if( p_off_7 < c_b)
                if( p_off_8 < c_b)
                 {bmin=b;continue;}
                else
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_13 > cb)
                if( p_off_7 > cb)
                 if( p_off_8 > cb)
                  if( p_off_9 > cb)
                   if( p_off_10 > cb)
                    if( p_off_11 > cb)
                     if( p_off_12 > cb)
                      if( p_off_14 > cb)
                       if( p_off_15 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_12 > cb)
               if( p_off_7 > cb)
                if( p_off_8 > cb)
                 if( p_off_9 > cb)
                  if( p_off_10 > cb)
                   if( p_off_11 > cb)
                    if( p_off_13 > cb)
                     if( p_off_14 > cb)
                      if( p_off_6 > cb)
                       {bmin=b;continue;}
                      else
                       if( p_off_15 > cb)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      if( p_off_10 < c_b)
                       if( p_off_11 < c_b)
                        {bmin=b;continue;}
                       else
                        {bmax=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             if( p_off_11 > cb)
              if( p_off_7 > cb)
               if( p_off_8 > cb)
                if( p_off_9 > cb)
                 if( p_off_10 > cb)
                  if( p_off_12 > cb)
                   if( p_off_13 > cb)
                    if( p_off_6 > cb)
                     if( p_off_5 > cb)
                      {bmin=b;continue;}
                     else
                      if( p_off_14 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                    else
                     if( p_off_14 > cb)
                      if( p_off_15 > cb)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      if( p_off_10 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      if( p_off_10 < c_b)
                       {bmin=b;continue;}
                      else
                       {bmax=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
           else
            if( p_off_10 > cb)
             if( p_off_7 > cb)
              if( p_off_8 > cb)
               if( p_off_9 > cb)
                if( p_off_11 > cb)
                 if( p_off_12 > cb)
                  if( p_off_6 > cb)
                   if( p_off_5 > cb)
                    if( p_off_4 > cb)
                     {bmin=b;continue;}
                    else
                     if( p_off_13 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                   else
                    if( p_off_13 > cb)
                     if( p_off_14 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                  else
                   if( p_off_13 > cb)
                    if( p_off_14 > cb)
                     if( p_off_15 > cb)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else if( p_off_10 < c_b)
             if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     if( p_off_9 < c_b)
                      {bmin=b;continue;}
                     else
                      {bmax=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
          else
           if( p_off_9 > cb)
            if( p_off_7 > cb)
             if( p_off_8 > cb)
              if( p_off_10 > cb)
               if( p_off_11 > cb)
                if( p_off_6 > cb)
                 if( p_off_5 > cb)
                  if( p_off_4 > cb)
                   if( p_off_3 > cb)
                    {bmin=b;continue;}
                   else
                    if( p_off_12 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                  else
                   if( p_off_12 > cb)
                    if( p_off_13 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_12 > cb)
                   if( p_off_13 > cb)
                    if( p_off_14 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_12 > cb)
                  if( p_off_13 > cb)
                   if( p_off_14 > cb)
                    if( p_off_15 > cb)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else if( p_off_9 < c_b)
            if( p_off_10 < c_b)
             if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    if( p_off_8 < c_b)
                     {bmin=b;continue;}
                    else
                     {bmax=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
         else
          if( p_off_8 > cb)
           if( p_off_7 > cb)
            if( p_off_9 > cb)
             if( p_off_10 > cb)
              if( p_off_6 > cb)
               if( p_off_5 > cb)
                if( p_off_4 > cb)
                 if( p_off_3 > cb)
                  if( p_off_2 > cb)
                   {bmin=b;continue;}
                  else
                   if( p_off_11 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                 else
                  if( p_off_11 > cb)
                   if( p_off_12 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_11 > cb)
                  if( p_off_12 > cb)
                   if( p_off_13 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_11 > cb)
                 if( p_off_12 > cb)
                  if( p_off_13 > cb)
                   if( p_off_14 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_11 > cb)
                if( p_off_12 > cb)
                 if( p_off_13 > cb)
                  if( p_off_14 > cb)
                   if( p_off_15 > cb)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else if( p_off_8 < c_b)
           if( p_off_9 < c_b)
            if( p_off_10 < c_b)
             if( p_off_11 < c_b)
              if( p_off_12 < c_b)
               if( p_off_13 < c_b)
                if( p_off_14 < c_b)
                 if( p_off_15 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_3 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_2 < c_b)
               if( p_off_3 < c_b)
                if( p_off_4 < c_b)
                 if( p_off_5 < c_b)
                  if( p_off_6 < c_b)
                   if( p_off_7 < c_b)
                    {bmin=b;continue;}
                   else
                    {bmax=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           {bmax=b;continue;}
        else
         if( p_off_7 > cb)
          if( p_off_8 > cb)
           if( p_off_9 > cb)
            if( p_off_6 > cb)
             if( p_off_5 > cb)
              if( p_off_4 > cb)
               if( p_off_3 > cb)
                if( p_off_2 > cb)
                 if( p_off_1 > cb)
                  {bmin=b;continue;}
                 else
                  if( p_off_10 > cb)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_10 > cb)
                  if( p_off_11 > cb)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_10 > cb)
                 if( p_off_11 > cb)
                  if( p_off_12 > cb)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_10 > cb)
                if( p_off_11 > cb)
                 if( p_off_12 > cb)
                  if( p_off_13 > cb)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_10 > cb)
               if( p_off_11 > cb)
                if( p_off_12 > cb)
                 if( p_off_13 > cb)
                  if( p_off_14 > cb)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             if( p_off_10 > cb)
              if( p_off_11 > cb)
               if( p_off_12 > cb)
                if( p_off_13 > cb)
                 if( p_off_14 > cb)
                  if( p_off_15 > cb)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           {bmax=b;continue;}
         else if( p_off_7 < c_b)
          if( p_off_8 < c_b)
           if( p_off_9 < c_b)
            if( p_off_6 < c_b)
             if( p_off_5 < c_b)
              if( p_off_4 < c_b)
               if( p_off_3 < c_b)
                if( p_off_2 < c_b)
                 if( p_off_1 < c_b)
                  {bmin=b;continue;}
                 else
                  if( p_off_10 < c_b)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                else
                 if( p_off_10 < c_b)
                  if( p_off_11 < c_b)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
               else
                if( p_off_10 < c_b)
                 if( p_off_11 < c_b)
                  if( p_off_12 < c_b)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
              else
               if( p_off_10 < c_b)
                if( p_off_11 < c_b)
                 if( p_off_12 < c_b)
                  if( p_off_13 < c_b)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
             else
              if( p_off_10 < c_b)
               if( p_off_11 < c_b)
                if( p_off_12 < c_b)
                 if( p_off_13 < c_b)
                  if( p_off_14 < c_b)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
            else
             if( p_off_10 < c_b)
              if( p_off_11 < c_b)
               if( p_off_12 < c_b)
                if( p_off_13 < c_b)
                 if( p_off_14 < c_b)
                  if( p_off_15 < c_b)
                   {bmin=b;continue;}
                  else
                   {bmax=b;continue;}
                 else
                  {bmax=b;continue;}
                else
                 {bmax=b;continue;}
               else
                {bmax=b;continue;}
              else
               {bmax=b;continue;}
             else
              {bmax=b;continue;}
           else
            {bmax=b;continue;}
          else
           {bmax=b;continue;}
         else
          {bmax=b;continue;}

	/*	is_a_corner:
			bmin=b;
			break end_if;

		is_not_a_corner:
			bmax=b;
			break end_if;

		end_if:

		if(bmin == bmax - 1 || bmin == bmax)
			return bmin;
		b = (bmin + bmax) / 2;*/
    }
    return bmin;

}
/*
  //The idea that the JIT can optimize a method in the inner-loop is not true: the runtime is 13ms versus 200ms
private static final void fast9_detect_check(int x, int y, int[] p,int b,int offset_pointer,int[] pixel,List<XY> ret_corners)
{
 int cb=p[offset_pointer]+b;
            int c_b=p[offset_pointer]-b;

            int p_off_0=p[offset_pointer+pixel[0]];
            int p_off_1=p[offset_pointer+pixel[1]];
            int p_off_2=p[offset_pointer+pixel[2]];
            int p_off_3=p[offset_pointer+pixel[3]];
            int p_off_4=p[offset_pointer+pixel[4]];
            int p_off_5=p[offset_pointer+pixel[5]];
            int p_off_6=p[offset_pointer+pixel[6]];
            int p_off_7=p[offset_pointer+pixel[7]];
            int p_off_8=p[offset_pointer+pixel[8]];
            int p_off_9=p[offset_pointer+pixel[9]];
            int p_off_10=p[offset_pointer+pixel[10]];
            int p_off_11=p[offset_pointer+pixel[11]];
            int p_off_12=p[offset_pointer+pixel[12]];
            int p_off_13=p[offset_pointer+pixel[13]];
            int p_off_14=p[offset_pointer+pixel[14]];
            int p_off_15=p[offset_pointer+pixel[15]];


        if(p_off_0 > cb)
         if(p_off_1 > cb)
          if(p_off_2 > cb)
           if(p_off_3 > cb)
            if(p_off_4 > cb)
             if(p_off_5 > cb)
              if(p_off_6 > cb)
               if(p_off_7 > cb)
                if(p_off_8 > cb)
                 {}
                else
                 if(p_off_15 > cb)
                  {}
                 else
                  return;
               else if(p_off_7 < c_b)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  return;
                else if(p_off_14 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_13 < c_b)
                       if(p_off_15 < c_b)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  return;
                else
                 return;
              else if(p_off_6 < c_b)
               if(p_off_15 > cb)
                if(p_off_13 > cb)
                 if(p_off_14 > cb)
                  {}
                 else
                  return;
                else if(p_off_13 < c_b)
                 if(p_off_7 < c_b)
                  if(p_off_8 < c_b)
                   if(p_off_9 < c_b)
                    if(p_off_10 < c_b)
                     if(p_off_11 < c_b)
                      if(p_off_12 < c_b)
                       if(p_off_14 < c_b)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_13 < c_b)
                       if(p_off_14 < c_b)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  return;
                else
                 return;
               else if(p_off_13 < c_b)
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_14 < c_b)
                       if(p_off_15 < c_b)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else if(p_off_5 < c_b)
              if(p_off_14 > cb)
               if(p_off_12 > cb)
                if(p_off_13 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       if(p_off_11 > cb)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 return;
               else if(p_off_12 < c_b)
                if(p_off_6 < c_b)
                 if(p_off_7 < c_b)
                  if(p_off_8 < c_b)
                   if(p_off_9 < c_b)
                    if(p_off_10 < c_b)
                     if(p_off_11 < c_b)
                      if(p_off_13 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else if(p_off_14 < c_b)
               if(p_off_7 < c_b)
                if(p_off_8 < c_b)
                 if(p_off_9 < c_b)
                  if(p_off_10 < c_b)
                   if(p_off_11 < c_b)
                    if(p_off_12 < c_b)
                     if(p_off_13 < c_b)
                      if(p_off_6 < c_b)
                       {}
                      else
                       if(p_off_15 < c_b)
                        {}
                       else
                        return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               if(p_off_6 < c_b)
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_13 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       if(p_off_11 > cb)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 return;
               else
                return;
              else if(p_off_12 < c_b)
               if(p_off_7 < c_b)
                if(p_off_8 < c_b)
                 if(p_off_9 < c_b)
                  if(p_off_10 < c_b)
                   if(p_off_11 < c_b)
                    if(p_off_13 < c_b)
                     if(p_off_14 < c_b)
                      if(p_off_6 < c_b)
                       {}
                      else
                       if(p_off_15 < c_b)
                        {}
                       else
                        return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else if(p_off_4 < c_b)
             if(p_off_13 > cb)
              if(p_off_11 > cb)
               if(p_off_12 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                return;
              else if(p_off_11 < c_b)
               if(p_off_5 < c_b)
                if(p_off_6 < c_b)
                 if(p_off_7 < c_b)
                  if(p_off_8 < c_b)
                   if(p_off_9 < c_b)
                    if(p_off_10 < c_b)
                     if(p_off_12 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else if(p_off_13 < c_b)
              if(p_off_7 < c_b)
               if(p_off_8 < c_b)
                if(p_off_9 < c_b)
                 if(p_off_10 < c_b)
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    if(p_off_6 < c_b)
                     if(p_off_5 < c_b)
                      {}
                     else
                      if(p_off_14 < c_b)
                       {}
                      else
                       return;
                    else
                     if(p_off_14 < c_b)
                      if(p_off_15 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else
              if(p_off_5 < c_b)
               if(p_off_6 < c_b)
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                return;
              else
               return;
             else if(p_off_11 < c_b)
              if(p_off_7 < c_b)
               if(p_off_8 < c_b)
                if(p_off_9 < c_b)
                 if(p_off_10 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_6 < c_b)
                     if(p_off_5 < c_b)
                      {}
                     else
                      if(p_off_14 < c_b)
                       {}
                      else
                       return;
                    else
                     if(p_off_14 < c_b)
                      if(p_off_15 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
           else if(p_off_3 < c_b)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               return;
             else
              return;
            else if(p_off_10 < c_b)
             if(p_off_7 < c_b)
              if(p_off_8 < c_b)
               if(p_off_9 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_6 < c_b)
                  if(p_off_5 < c_b)
                   if(p_off_4 < c_b)
                    {}
                   else
                    if(p_off_12 < c_b)
                     if(p_off_13 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                  else
                   if(p_off_12 < c_b)
                    if(p_off_13 < c_b)
                     if(p_off_14 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                 else
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     if(p_off_15 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
            else
             return;
           else
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               return;
             else
              return;
            else if(p_off_10 < c_b)
             if(p_off_7 < c_b)
              if(p_off_8 < c_b)
               if(p_off_9 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_5 < c_b)
                    if(p_off_4 < c_b)
                     {}
                    else
                     if(p_off_13 < c_b)
                      {}
                     else
                      return;
                   else
                    if(p_off_13 < c_b)
                     if(p_off_14 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                  else
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     if(p_off_15 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
            else
             return;
          else if(p_off_2 < c_b)
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              return;
            else
             return;
           else if(p_off_9 < c_b)
            if(p_off_7 < c_b)
             if(p_off_8 < c_b)
              if(p_off_10 < c_b)
               if(p_off_6 < c_b)
                if(p_off_5 < c_b)
                 if(p_off_4 < c_b)
                  if(p_off_3 < c_b)
                   {}
                  else
                   if(p_off_11 < c_b)
                    if(p_off_12 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                 else
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    if(p_off_13 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    if(p_off_15 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               return;
             else
              return;
            else
             return;
           else
            return;
          else
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              return;
            else
             return;
           else if(p_off_9 < c_b)
            if(p_off_7 < c_b)
             if(p_off_8 < c_b)
              if(p_off_10 < c_b)
               if(p_off_11 < c_b)
                if(p_off_6 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_4 < c_b)
                   if(p_off_3 < c_b)
                    {}
                   else
                    if(p_off_12 < c_b)
                     {}
                    else
                     return;
                  else
                   if(p_off_12 < c_b)
                    if(p_off_13 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                 else
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    if(p_off_15 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                return;
              else
               return;
             else
              return;
            else
             return;
           else
            return;
         else if(p_off_1 < c_b)
          if(p_off_8 > cb)
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_2 > cb)
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             return;
           else
            return;
          else if(p_off_8 < c_b)
           if(p_off_7 < c_b)
            if(p_off_9 < c_b)
             if(p_off_6 < c_b)
              if(p_off_5 < c_b)
               if(p_off_4 < c_b)
                if(p_off_3 < c_b)
                 if(p_off_2 < c_b)
                  {}
                 else
                  if(p_off_10 < c_b)
                   if(p_off_11 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_10 < c_b)
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_10 < c_b)
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_10 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_10 < c_b)
               if(p_off_11 < c_b)
                if(p_off_12 < c_b)
                 if(p_off_13 < c_b)
                  if(p_off_14 < c_b)
                   if(p_off_15 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             return;
           else
            return;
          else
           return;
         else
          if(p_off_8 > cb)
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_2 > cb)
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             return;
           else
            return;
          else if(p_off_8 < c_b)
           if(p_off_7 < c_b)
            if(p_off_9 < c_b)
             if(p_off_10 < c_b)
              if(p_off_6 < c_b)
               if(p_off_5 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_3 < c_b)
                  if(p_off_2 < c_b)
                   {}
                  else
                   if(p_off_11 < c_b)
                    {}
                   else
                    return;
                 else
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_11 < c_b)
                if(p_off_12 < c_b)
                 if(p_off_13 < c_b)
                  if(p_off_14 < c_b)
                   if(p_off_15 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              return;
            else
             return;
           else
            return;
          else
           return;
        else if(p_off_0 < c_b)
         if(p_off_1 > cb)
          if(p_off_8 > cb)
           if(p_off_7 > cb)
            if(p_off_9 > cb)
             if(p_off_6 > cb)
              if(p_off_5 > cb)
               if(p_off_4 > cb)
                if(p_off_3 > cb)
                 if(p_off_2 > cb)
                  {}
                 else
                  if(p_off_10 > cb)
                   if(p_off_11 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_10 > cb)
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_10 > cb)
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_10 > cb)
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_10 > cb)
               if(p_off_11 > cb)
                if(p_off_12 > cb)
                 if(p_off_13 > cb)
                  if(p_off_14 > cb)
                   if(p_off_15 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             return;
           else
            return;
          else if(p_off_8 < c_b)
           if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_2 < c_b)
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             return;
           else
            return;
          else
           return;
         else if(p_off_1 < c_b)
          if(p_off_2 > cb)
           if(p_off_9 > cb)
            if(p_off_7 > cb)
             if(p_off_8 > cb)
              if(p_off_10 > cb)
               if(p_off_6 > cb)
                if(p_off_5 > cb)
                 if(p_off_4 > cb)
                  if(p_off_3 > cb)
                   {}
                  else
                   if(p_off_11 > cb)
                    if(p_off_12 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                 else
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    if(p_off_13 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    if(p_off_15 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               return;
             else
              return;
            else
             return;
           else if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              return;
            else
             return;
           else
            return;
          else if(p_off_2 < c_b)
           if(p_off_3 > cb)
            if(p_off_10 > cb)
             if(p_off_7 > cb)
              if(p_off_8 > cb)
               if(p_off_9 > cb)
                if(p_off_11 > cb)
                 if(p_off_6 > cb)
                  if(p_off_5 > cb)
                   if(p_off_4 > cb)
                    {}
                   else
                    if(p_off_12 > cb)
                     if(p_off_13 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                  else
                   if(p_off_12 > cb)
                    if(p_off_13 > cb)
                     if(p_off_14 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                 else
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     if(p_off_15 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
            else if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               return;
             else
              return;
            else
             return;
           else if(p_off_3 < c_b)
            if(p_off_4 > cb)
             if(p_off_13 > cb)
              if(p_off_7 > cb)
               if(p_off_8 > cb)
                if(p_off_9 > cb)
                 if(p_off_10 > cb)
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    if(p_off_6 > cb)
                     if(p_off_5 > cb)
                      {}
                     else
                      if(p_off_14 > cb)
                       {}
                      else
                       return;
                    else
                     if(p_off_14 > cb)
                      if(p_off_15 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else if(p_off_13 < c_b)
              if(p_off_11 > cb)
               if(p_off_5 > cb)
                if(p_off_6 > cb)
                 if(p_off_7 > cb)
                  if(p_off_8 > cb)
                   if(p_off_9 > cb)
                    if(p_off_10 > cb)
                     if(p_off_12 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else if(p_off_11 < c_b)
               if(p_off_12 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                return;
              else
               return;
             else
              if(p_off_5 > cb)
               if(p_off_6 > cb)
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else if(p_off_4 < c_b)
             if(p_off_5 > cb)
              if(p_off_14 > cb)
               if(p_off_7 > cb)
                if(p_off_8 > cb)
                 if(p_off_9 > cb)
                  if(p_off_10 > cb)
                   if(p_off_11 > cb)
                    if(p_off_12 > cb)
                     if(p_off_13 > cb)
                      if(p_off_6 > cb)
                       {}
                      else
                       if(p_off_15 > cb)
                        {}
                       else
                        return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else if(p_off_14 < c_b)
               if(p_off_12 > cb)
                if(p_off_6 > cb)
                 if(p_off_7 > cb)
                  if(p_off_8 > cb)
                   if(p_off_9 > cb)
                    if(p_off_10 > cb)
                     if(p_off_11 > cb)
                      if(p_off_13 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else if(p_off_12 < c_b)
                if(p_off_13 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       if(p_off_11 < c_b)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 return;
               else
                return;
              else
               if(p_off_6 > cb)
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_13 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else if(p_off_5 < c_b)
              if(p_off_6 > cb)
               if(p_off_15 < c_b)
                if(p_off_13 > cb)
                 if(p_off_7 > cb)
                  if(p_off_8 > cb)
                   if(p_off_9 > cb)
                    if(p_off_10 > cb)
                     if(p_off_11 > cb)
                      if(p_off_12 > cb)
                       if(p_off_14 > cb)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else if(p_off_13 < c_b)
                 if(p_off_14 < c_b)
                  {}
                 else
                  return;
                else
                 return;
               else
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_13 > cb)
                       if(p_off_14 > cb)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else if(p_off_6 < c_b)
               if(p_off_7 > cb)
                if(p_off_14 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_13 > cb)
                       if(p_off_15 > cb)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  return;
                else
                 return;
               else if(p_off_7 < c_b)
                if(p_off_8 < c_b)
                 {}
                else
                 if(p_off_15 < c_b)
                  {}
                 else
                  return;
               else
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  return;
                else
                 return;
              else
               if(p_off_13 > cb)
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_14 > cb)
                       if(p_off_15 > cb)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_12 > cb)
               if(p_off_7 > cb)
                if(p_off_8 > cb)
                 if(p_off_9 > cb)
                  if(p_off_10 > cb)
                   if(p_off_11 > cb)
                    if(p_off_13 > cb)
                     if(p_off_14 > cb)
                      if(p_off_6 > cb)
                       {}
                      else
                       if(p_off_15 > cb)
                        {}
                       else
                        return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       if(p_off_11 < c_b)
                        {}
                       else
                        return;
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 return;
               else
                return;
              else
               return;
            else
             if(p_off_11 > cb)
              if(p_off_7 > cb)
               if(p_off_8 > cb)
                if(p_off_9 > cb)
                 if(p_off_10 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_6 > cb)
                     if(p_off_5 > cb)
                      {}
                     else
                      if(p_off_14 > cb)
                       {}
                      else
                       return;
                    else
                     if(p_off_14 > cb)
                      if(p_off_15 > cb)
                       {}
                      else
                       return;
                     else
                      return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       return;
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                return;
              else
               return;
             else
              return;
           else
            if(p_off_10 > cb)
             if(p_off_7 > cb)
              if(p_off_8 > cb)
               if(p_off_9 > cb)
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_6 > cb)
                   if(p_off_5 > cb)
                    if(p_off_4 > cb)
                     {}
                    else
                     if(p_off_13 > cb)
                      {}
                     else
                      return;
                   else
                    if(p_off_13 > cb)
                     if(p_off_14 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                  else
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     if(p_off_15 > cb)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
            else if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      return;
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               return;
             else
              return;
            else
             return;
          else
           if(p_off_9 > cb)
            if(p_off_7 > cb)
             if(p_off_8 > cb)
              if(p_off_10 > cb)
               if(p_off_11 > cb)
                if(p_off_6 > cb)
                 if(p_off_5 > cb)
                  if(p_off_4 > cb)
                   if(p_off_3 > cb)
                    {}
                   else
                    if(p_off_12 > cb)
                     {}
                    else
                     return;
                  else
                   if(p_off_12 > cb)
                    if(p_off_13 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                 else
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    if(p_off_15 > cb)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                return;
              else
               return;
             else
              return;
            else
             return;
           else if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     return;
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              return;
            else
             return;
           else
            return;
         else
          if(p_off_8 > cb)
           if(p_off_7 > cb)
            if(p_off_9 > cb)
             if(p_off_10 > cb)
              if(p_off_6 > cb)
               if(p_off_5 > cb)
                if(p_off_4 > cb)
                 if(p_off_3 > cb)
                  if(p_off_2 > cb)
                   {}
                  else
                   if(p_off_11 > cb)
                    {}
                   else
                    return;
                 else
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_11 > cb)
                if(p_off_12 > cb)
                 if(p_off_13 > cb)
                  if(p_off_14 > cb)
                   if(p_off_15 > cb)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              return;
            else
             return;
           else
            return;
          else if(p_off_8 < c_b)
           if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_2 < c_b)
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    return;
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             return;
           else
            return;
          else
           return;
        else
         if(p_off_7 > cb)
          if(p_off_8 > cb)
           if(p_off_9 > cb)
            if(p_off_6 > cb)
             if(p_off_5 > cb)
              if(p_off_4 > cb)
               if(p_off_3 > cb)
                if(p_off_2 > cb)
                 if(p_off_1 > cb)
                  {}
                 else
                  if(p_off_10 > cb)
                   {}
                  else
                   return;
                else
                 if(p_off_10 > cb)
                  if(p_off_11 > cb)
                   {}
                  else
                   return;
                 else
                  return;
               else
                if(p_off_10 > cb)
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_10 > cb)
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_10 > cb)
               if(p_off_11 > cb)
                if(p_off_12 > cb)
                 if(p_off_13 > cb)
                  if(p_off_14 > cb)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             if(p_off_10 > cb)
              if(p_off_11 > cb)
               if(p_off_12 > cb)
                if(p_off_13 > cb)
                 if(p_off_14 > cb)
                  if(p_off_15 > cb)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
           else
            return;
          else
           return;
         else if(p_off_7 < c_b)
          if(p_off_8 < c_b)
           if(p_off_9 < c_b)
            if(p_off_6 < c_b)
             if(p_off_5 < c_b)
              if(p_off_4 < c_b)
               if(p_off_3 < c_b)
                if(p_off_2 < c_b)
                 if(p_off_1 < c_b)
                  {}
                 else
                  if(p_off_10 < c_b)
                   {}
                  else
                   return;
                else
                 if(p_off_10 < c_b)
                  if(p_off_11 < c_b)
                   {}
                  else
                   return;
                 else
                  return;
               else
                if(p_off_10 < c_b)
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
              else
               if(p_off_10 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
             else
              if(p_off_10 < c_b)
               if(p_off_11 < c_b)
                if(p_off_12 < c_b)
                 if(p_off_13 < c_b)
                  if(p_off_14 < c_b)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
            else
             if(p_off_10 < c_b)
              if(p_off_11 < c_b)
               if(p_off_12 < c_b)
                if(p_off_13 < c_b)
                 if(p_off_14 < c_b)
                  if(p_off_15 < c_b)
                   {}
                  else
                   return;
                 else
                  return;
                else
                 return;
               else
                return;
              else
               return;
             else
              return;
           else
            return;
          else
           return;
         else
          return;
//			if(num_corners == rsize)
//			{
//				rsize*=2;
//				ret_corners = (xy*)realloc(ret_corners, sizeof(xy)*rsize);
//
//			}
//			ret_corners[num_corners].x = x;
//			ret_corners[num_corners].y = y;
//
//
           // num_corners++;
            ret_corners.add(new XY(x,y));
}
*/


public final static XY[] fast9_detect_loop(int[] p, int xsize, int ysize, int stride, int b, int[] ret_num_corners)
{

	int[] pixel=new int[16];
	int x, y;
    int offset_pointer;

	make_offsets(pixel, stride);

    List ret_corners=new LinkedList();

    int MIN_contiguous=9;
    int y_stride;


	for(y=3; y < ysize - 3; y++)
    {
        y_stride=y*stride;
        next_inner_loop:
		for(x=3; x < xsize - 3; x++)
		{


            offset_pointer=y_stride+x;


            int cb=p[offset_pointer]+b;
            int c_b=p[offset_pointer]-b;


            int contiguous_count=0;
           

            int[] pixel_prep=new int[16];

            //just fastest exclusion in compass directions
            pixel_prep[1]=p[offset_pointer+pixel[1]];
            pixel_prep[5]=p[offset_pointer+pixel[5]];
            pixel_prep[9]=p[offset_pointer+pixel[9]];
            pixel_prep[13]=p[offset_pointer+pixel[13]];


            if (
                    //compass pre-check for normal corner
                (pixel_prep[1]>cb && pixel_prep[5]>cb  && pixel_prep[9]>cb )
                ||
                (pixel_prep[1]>cb && pixel_prep[5]>cb   && pixel_prep[13]>cb)
                ||
                (pixel_prep[1]>cb   && pixel_prep[9]>cb && pixel_prep[13]>cb)
                ||
                ( pixel_prep[5]>cb  && pixel_prep[9]>cb && pixel_prep[13]>cb)

                //inverse corner pre-check
                ||
                (pixel_prep[1]<c_b && pixel_prep[5]<c_b  && pixel_prep[9]<c_b )
                ||
                (pixel_prep[1]<c_b && pixel_prep[5]<c_b  && pixel_prep[13]<c_b)
                ||
                (pixel_prep[1]<c_b   && pixel_prep[9]<c_b && pixel_prep[13]<c_b)
                ||
                ( pixel_prep[5]<c_b  && pixel_prep[9]<c_b && pixel_prep[13]<c_b)

                )
            {
            //now detail look
            pixel_prep[0]=p[offset_pointer+pixel[0]];
            
            pixel_prep[2]=p[offset_pointer+pixel[2]];
            pixel_prep[3]=p[offset_pointer+pixel[3]];
            pixel_prep[4]=p[offset_pointer+pixel[4]];
            
            pixel_prep[6]=p[offset_pointer+pixel[6]];
            pixel_prep[7]=p[offset_pointer+pixel[7]];
            pixel_prep[8]=p[offset_pointer+pixel[8]];
            
            pixel_prep[10]=p[offset_pointer+pixel[10]];
            pixel_prep[11]=p[offset_pointer+pixel[11]];
            pixel_prep[12]=p[offset_pointer+pixel[12]];
            
            pixel_prep[14]=p[offset_pointer+pixel[14]];
            pixel_prep[15]=p[offset_pointer+pixel[15]];




            //for (int i=0;i<16;i++)
            for (int i=15+MIN_contiguous;i>=0;i--)
            {
               
                if (pixel_prep[i%MIN_contiguous]>cb)
                    contiguous_count++;
                else
                    contiguous_count=0;

                if (contiguous_count>=MIN_contiguous)
                {
                    ret_corners.add(new XY(x,y));
                    continue next_inner_loop;
                }
            }

            for (int i=15+MIN_contiguous;i>=0;i--)
            {
               
                if (pixel_prep[i%MIN_contiguous]>cb)
                    contiguous_count++;
                else
                    contiguous_count=0;

                if (contiguous_count>=MIN_contiguous)
                {
                    ret_corners.add(new XY(x,y));
                    continue next_inner_loop;
                }
            }


            //and now inverse

            contiguous_count=0;
      
            //for (int i=0;i<16;i++)
            for (int i=15+MIN_contiguous;i>=0;i--)
            {
             
                if (pixel_prep[i%MIN_contiguous]<c_b)
                    contiguous_count++;
                else
                    contiguous_count=0;

                if (contiguous_count>=MIN_contiguous)
                {
                    ret_corners.add(new XY(x,y));
                    continue next_inner_loop;
                }
            }
            }else{
                continue;
            }

        }

    }
    ret_num_corners[0] = ret_corners.size();
	return (XY[])ret_corners.toArray(new XY[ret_corners.size()]);
}

public final static XY[] fast9_detect(final int[] p, int xsize, int ysize, int stride, int b, int[] ret_num_corners)
{
	int num_corners=0;
	//XY[] ret_corners;
	int rsize=512;
	final int[] pixel=new int[16];
	int x, y;
    int offset_pointer;
	//ret_corners = new XY[rsize];
	make_offsets(pixel, stride);
    
    List ret_corners=new LinkedList();

    int y_stride;
//    long start=System.nanoTime();

	for(y=3; y < ysize - 3; y++)
    {
        y_stride=y*stride;
		for(x=3; x < xsize - 3; x++)
		{
			//const byte* p = im + y*stride + x;

            offset_pointer=y_stride+x;
          //  fast9_detect_check(x, y, p, b, offset_pointer, pixel, ret_corners);
			//int cb = *p + b;
			//int c_b= *p - b;

            //int cb=im[offset_pointer+b];
            //int c_b=im[offset_pointer-b];

            int cb=p[offset_pointer]+b;
            int c_b=p[offset_pointer]-b;

            int p_off_1=p[offset_pointer+pixel[1]];
            int p_off_5=p[offset_pointer+pixel[5]];
            int p_off_9=p[offset_pointer+pixel[9]];
            int p_off_13=p[offset_pointer+pixel[13]];

            if (!( //I Know this is just really true for the 12er variant, but hey, speed matters
                    //compass pre-check for normal corner
                (p_off_1>cb && p_off_5>cb  && p_off_9>cb )
                ||
                (p_off_1>cb && p_off_5>cb   &&p_off_13>cb)
                ||
                (p_off_1>cb   && p_off_9>cb && p_off_13>cb)
                ||
                ( p_off_5>cb  && p_off_9>cb && p_off_13>cb)

                //inverse corner pre-check
                ||
                (p_off_1<c_b && p_off_5<c_b  && p_off_9<c_b )
                ||
                (p_off_1<c_b && p_off_5<c_b  && p_off_13<c_b)
                ||
                (p_off_1<c_b   && p_off_9<c_b && p_off_13<c_b)
                ||
                ( p_off_5<c_b  && p_off_9<c_b && p_off_13<c_b)

                ))
                continue;



            int p_off_0=p[offset_pointer+pixel[0]];
            
            int p_off_2=p[offset_pointer+pixel[2]];
            int p_off_3=p[offset_pointer+pixel[3]];
            int p_off_4=p[offset_pointer+pixel[4]];
            
            int p_off_6=p[offset_pointer+pixel[6]];
            int p_off_7=p[offset_pointer+pixel[7]];
            int p_off_8=p[offset_pointer+pixel[8]];
            
            int p_off_10=p[offset_pointer+pixel[10]];
            int p_off_11=p[offset_pointer+pixel[11]];
            int p_off_12=p[offset_pointer+pixel[12]];
            
            int p_off_14=p[offset_pointer+pixel[14]];
            int p_off_15=p[offset_pointer+pixel[15]];


        if(p_off_0 > cb)
         if(p_off_1 > cb)
          if(p_off_2 > cb)
           if(p_off_3 > cb)
            if(p_off_4 > cb)
             if(p_off_5 > cb)
              if(p_off_6 > cb)
               if(p_off_7 > cb)
                if(p_off_8 > cb)
                 {}
                else
                 if(p_off_15 > cb)
                  {}
                 else
                  continue;
               else if(p_off_7 < c_b)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  continue;
                else if(p_off_14 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_13 < c_b)
                       if(p_off_15 < c_b)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  continue;
                else
                 continue;
              else if(p_off_6 < c_b)
               if(p_off_15 > cb)
                if(p_off_13 > cb)
                 if(p_off_14 > cb)
                  {}
                 else
                  continue;
                else if(p_off_13 < c_b)
                 if(p_off_7 < c_b)
                  if(p_off_8 < c_b)
                   if(p_off_9 < c_b)
                    if(p_off_10 < c_b)
                     if(p_off_11 < c_b)
                      if(p_off_12 < c_b)
                       if(p_off_14 < c_b)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_13 < c_b)
                       if(p_off_14 < c_b)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  continue;
                else
                 continue;
               else if(p_off_13 < c_b)
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_14 < c_b)
                       if(p_off_15 < c_b)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else if(p_off_5 < c_b)
              if(p_off_14 > cb)
               if(p_off_12 > cb)
                if(p_off_13 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       if(p_off_11 > cb)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 continue;
               else if(p_off_12 < c_b)
                if(p_off_6 < c_b)
                 if(p_off_7 < c_b)
                  if(p_off_8 < c_b)
                   if(p_off_9 < c_b)
                    if(p_off_10 < c_b)
                     if(p_off_11 < c_b)
                      if(p_off_13 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else if(p_off_14 < c_b)
               if(p_off_7 < c_b)
                if(p_off_8 < c_b)
                 if(p_off_9 < c_b)
                  if(p_off_10 < c_b)
                   if(p_off_11 < c_b)
                    if(p_off_12 < c_b)
                     if(p_off_13 < c_b)
                      if(p_off_6 < c_b)
                       {}
                      else
                       if(p_off_15 < c_b)
                        {}
                       else
                        continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               if(p_off_6 < c_b)
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      if(p_off_13 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       if(p_off_11 > cb)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 continue;
               else
                continue;
              else if(p_off_12 < c_b)
               if(p_off_7 < c_b)
                if(p_off_8 < c_b)
                 if(p_off_9 < c_b)
                  if(p_off_10 < c_b)
                   if(p_off_11 < c_b)
                    if(p_off_13 < c_b)
                     if(p_off_14 < c_b)
                      if(p_off_6 < c_b)
                       {}
                      else
                       if(p_off_15 < c_b)
                        {}
                       else
                        continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else if(p_off_4 < c_b)
             if(p_off_13 > cb)
              if(p_off_11 > cb)
               if(p_off_12 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                continue;
              else if(p_off_11 < c_b)
               if(p_off_5 < c_b)
                if(p_off_6 < c_b)
                 if(p_off_7 < c_b)
                  if(p_off_8 < c_b)
                   if(p_off_9 < c_b)
                    if(p_off_10 < c_b)
                     if(p_off_12 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else if(p_off_13 < c_b)
              if(p_off_7 < c_b)
               if(p_off_8 < c_b)
                if(p_off_9 < c_b)
                 if(p_off_10 < c_b)
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    if(p_off_6 < c_b)
                     if(p_off_5 < c_b)
                      {}
                     else
                      if(p_off_14 < c_b)
                       {}
                      else
                       continue;
                    else
                     if(p_off_14 < c_b)
                      if(p_off_15 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              if(p_off_5 < c_b)
               if(p_off_6 < c_b)
                if(p_off_7 < c_b)
                 if(p_off_8 < c_b)
                  if(p_off_9 < c_b)
                   if(p_off_10 < c_b)
                    if(p_off_11 < c_b)
                     if(p_off_12 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      if(p_off_10 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                continue;
              else
               continue;
             else if(p_off_11 < c_b)
              if(p_off_7 < c_b)
               if(p_off_8 < c_b)
                if(p_off_9 < c_b)
                 if(p_off_10 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_6 < c_b)
                     if(p_off_5 < c_b)
                      {}
                     else
                      if(p_off_14 < c_b)
                       {}
                      else
                       continue;
                    else
                     if(p_off_14 < c_b)
                      if(p_off_15 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
           else if(p_off_3 < c_b)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               continue;
             else
              continue;
            else if(p_off_10 < c_b)
             if(p_off_7 < c_b)
              if(p_off_8 < c_b)
               if(p_off_9 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_6 < c_b)
                  if(p_off_5 < c_b)
                   if(p_off_4 < c_b)
                    {}
                   else
                    if(p_off_12 < c_b)
                     if(p_off_13 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                  else
                   if(p_off_12 < c_b)
                    if(p_off_13 < c_b)
                     if(p_off_14 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                 else
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     if(p_off_15 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
            else
             continue;
           else
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     if(p_off_9 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               continue;
             else
              continue;
            else if(p_off_10 < c_b)
             if(p_off_7 < c_b)
              if(p_off_8 < c_b)
               if(p_off_9 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_5 < c_b)
                    if(p_off_4 < c_b)
                     {}
                    else
                     if(p_off_13 < c_b)
                      {}
                     else
                      continue;
                   else
                    if(p_off_13 < c_b)
                     if(p_off_14 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                  else
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     if(p_off_15 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
            else
             continue;
          else if(p_off_2 < c_b)
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              continue;
            else
             continue;
           else if(p_off_9 < c_b)
            if(p_off_7 < c_b)
             if(p_off_8 < c_b)
              if(p_off_10 < c_b)
               if(p_off_6 < c_b)
                if(p_off_5 < c_b)
                 if(p_off_4 < c_b)
                  if(p_off_3 < c_b)
                   {}
                  else
                   if(p_off_11 < c_b)
                    if(p_off_12 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                 else
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    if(p_off_13 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    if(p_off_15 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               continue;
             else
              continue;
            else
             continue;
           else
            continue;
          else
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    if(p_off_8 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              continue;
            else
             continue;
           else if(p_off_9 < c_b)
            if(p_off_7 < c_b)
             if(p_off_8 < c_b)
              if(p_off_10 < c_b)
               if(p_off_11 < c_b)
                if(p_off_6 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_4 < c_b)
                   if(p_off_3 < c_b)
                    {}
                   else
                    if(p_off_12 < c_b)
                     {}
                    else
                     continue;
                  else
                   if(p_off_12 < c_b)
                    if(p_off_13 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                 else
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    if(p_off_14 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    if(p_off_15 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                continue;
              else
               continue;
             else
              continue;
            else
             continue;
           else
            continue;
         else if(p_off_1 < c_b)
          if(p_off_8 > cb)
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_2 > cb)
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             continue;
           else
            continue;
          else if(p_off_8 < c_b)
           if(p_off_7 < c_b)
            if(p_off_9 < c_b)
             if(p_off_6 < c_b)
              if(p_off_5 < c_b)
               if(p_off_4 < c_b)
                if(p_off_3 < c_b)
                 if(p_off_2 < c_b)
                  {}
                 else
                  if(p_off_10 < c_b)
                   if(p_off_11 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_10 < c_b)
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_10 < c_b)
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_10 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_10 < c_b)
               if(p_off_11 < c_b)
                if(p_off_12 < c_b)
                 if(p_off_13 < c_b)
                  if(p_off_14 < c_b)
                   if(p_off_15 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             continue;
           else
            continue;
          else
           continue;
         else
          if(p_off_8 > cb)
           if(p_off_9 > cb)
            if(p_off_10 > cb)
             if(p_off_11 > cb)
              if(p_off_12 > cb)
               if(p_off_13 > cb)
                if(p_off_14 > cb)
                 if(p_off_15 > cb)
                  {}
                 else
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_2 > cb)
               if(p_off_3 > cb)
                if(p_off_4 > cb)
                 if(p_off_5 > cb)
                  if(p_off_6 > cb)
                   if(p_off_7 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             continue;
           else
            continue;
          else if(p_off_8 < c_b)
           if(p_off_7 < c_b)
            if(p_off_9 < c_b)
             if(p_off_10 < c_b)
              if(p_off_6 < c_b)
               if(p_off_5 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_3 < c_b)
                  if(p_off_2 < c_b)
                   {}
                  else
                   if(p_off_11 < c_b)
                    {}
                   else
                    continue;
                 else
                  if(p_off_11 < c_b)
                   if(p_off_12 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   if(p_off_13 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   if(p_off_14 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_11 < c_b)
                if(p_off_12 < c_b)
                 if(p_off_13 < c_b)
                  if(p_off_14 < c_b)
                   if(p_off_15 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              continue;
            else
             continue;
           else
            continue;
          else
           continue;
        else if(p_off_0 < c_b)
         if(p_off_1 > cb)
          if(p_off_8 > cb)
           if(p_off_7 > cb)
            if(p_off_9 > cb)
             if(p_off_6 > cb)
              if(p_off_5 > cb)
               if(p_off_4 > cb)
                if(p_off_3 > cb)
                 if(p_off_2 > cb)
                  {}
                 else
                  if(p_off_10 > cb)
                   if(p_off_11 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_10 > cb)
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_10 > cb)
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_10 > cb)
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_10 > cb)
               if(p_off_11 > cb)
                if(p_off_12 > cb)
                 if(p_off_13 > cb)
                  if(p_off_14 > cb)
                   if(p_off_15 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             continue;
           else
            continue;
          else if(p_off_8 < c_b)
           if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_2 < c_b)
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             continue;
           else
            continue;
          else
           continue;
         else if(p_off_1 < c_b)
          if(p_off_2 > cb)
           if(p_off_9 > cb)
            if(p_off_7 > cb)
             if(p_off_8 > cb)
              if(p_off_10 > cb)
               if(p_off_6 > cb)
                if(p_off_5 > cb)
                 if(p_off_4 > cb)
                  if(p_off_3 > cb)
                   {}
                  else
                   if(p_off_11 > cb)
                    if(p_off_12 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                 else
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    if(p_off_13 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    if(p_off_15 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               continue;
             else
              continue;
            else
             continue;
           else if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              continue;
            else
             continue;
           else
            continue;
          else if(p_off_2 < c_b)
           if(p_off_3 > cb)
            if(p_off_10 > cb)
             if(p_off_7 > cb)
              if(p_off_8 > cb)
               if(p_off_9 > cb)
                if(p_off_11 > cb)
                 if(p_off_6 > cb)
                  if(p_off_5 > cb)
                   if(p_off_4 > cb)
                    {}
                   else
                    if(p_off_12 > cb)
                     if(p_off_13 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                  else
                   if(p_off_12 > cb)
                    if(p_off_13 > cb)
                     if(p_off_14 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                 else
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     if(p_off_15 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
            else if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               continue;
             else
              continue;
            else
             continue;
           else if(p_off_3 < c_b)
            if(p_off_4 > cb)
             if(p_off_13 > cb)
              if(p_off_7 > cb)
               if(p_off_8 > cb)
                if(p_off_9 > cb)
                 if(p_off_10 > cb)
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    if(p_off_6 > cb)
                     if(p_off_5 > cb)
                      {}
                     else
                      if(p_off_14 > cb)
                       {}
                      else
                       continue;
                    else
                     if(p_off_14 > cb)
                      if(p_off_15 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else if(p_off_13 < c_b)
              if(p_off_11 > cb)
               if(p_off_5 > cb)
                if(p_off_6 > cb)
                 if(p_off_7 > cb)
                  if(p_off_8 > cb)
                   if(p_off_9 > cb)
                    if(p_off_10 > cb)
                     if(p_off_12 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else if(p_off_11 < c_b)
               if(p_off_12 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                continue;
              else
               continue;
             else
              if(p_off_5 > cb)
               if(p_off_6 > cb)
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else if(p_off_4 < c_b)
             if(p_off_5 > cb)
              if(p_off_14 > cb)
               if(p_off_7 > cb)
                if(p_off_8 > cb)
                 if(p_off_9 > cb)
                  if(p_off_10 > cb)
                   if(p_off_11 > cb)
                    if(p_off_12 > cb)
                     if(p_off_13 > cb)
                      if(p_off_6 > cb)
                       {}
                      else
                       if(p_off_15 > cb)
                        {}
                       else
                        continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else if(p_off_14 < c_b)
               if(p_off_12 > cb)
                if(p_off_6 > cb)
                 if(p_off_7 > cb)
                  if(p_off_8 > cb)
                   if(p_off_9 > cb)
                    if(p_off_10 > cb)
                     if(p_off_11 > cb)
                      if(p_off_13 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else if(p_off_12 < c_b)
                if(p_off_13 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       if(p_off_11 < c_b)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 continue;
               else
                continue;
              else
               if(p_off_6 > cb)
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_13 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else if(p_off_5 < c_b)
              if(p_off_6 > cb)
               if(p_off_15 < c_b)
                if(p_off_13 > cb)
                 if(p_off_7 > cb)
                  if(p_off_8 > cb)
                   if(p_off_9 > cb)
                    if(p_off_10 > cb)
                     if(p_off_11 > cb)
                      if(p_off_12 > cb)
                       if(p_off_14 > cb)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else if(p_off_13 < c_b)
                 if(p_off_14 < c_b)
                  {}
                 else
                  continue;
                else
                 continue;
               else
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_13 > cb)
                       if(p_off_14 > cb)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else if(p_off_6 < c_b)
               if(p_off_7 > cb)
                if(p_off_14 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_13 > cb)
                       if(p_off_15 > cb)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  continue;
                else
                 continue;
               else if(p_off_7 < c_b)
                if(p_off_8 < c_b)
                 {}
                else
                 if(p_off_15 < c_b)
                  {}
                 else
                  continue;
               else
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_13 > cb)
                if(p_off_7 > cb)
                 if(p_off_8 > cb)
                  if(p_off_9 > cb)
                   if(p_off_10 > cb)
                    if(p_off_11 > cb)
                     if(p_off_12 > cb)
                      if(p_off_14 > cb)
                       if(p_off_15 > cb)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_12 > cb)
               if(p_off_7 > cb)
                if(p_off_8 > cb)
                 if(p_off_9 > cb)
                  if(p_off_10 > cb)
                   if(p_off_11 > cb)
                    if(p_off_13 > cb)
                     if(p_off_14 > cb)
                      if(p_off_6 > cb)
                       {}
                      else
                       if(p_off_15 > cb)
                        {}
                       else
                        continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       if(p_off_11 < c_b)
                        {}
                       else
                        continue;
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             if(p_off_11 > cb)
              if(p_off_7 > cb)
               if(p_off_8 > cb)
                if(p_off_9 > cb)
                 if(p_off_10 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_6 > cb)
                     if(p_off_5 > cb)
                      {}
                     else
                      if(p_off_14 > cb)
                       {}
                      else
                       continue;
                    else
                     if(p_off_14 > cb)
                      if(p_off_15 > cb)
                       {}
                      else
                       continue;
                     else
                      continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      if(p_off_10 < c_b)
                       {}
                      else
                       continue;
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                continue;
              else
               continue;
             else
              continue;
           else
            if(p_off_10 > cb)
             if(p_off_7 > cb)
              if(p_off_8 > cb)
               if(p_off_9 > cb)
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_6 > cb)
                   if(p_off_5 > cb)
                    if(p_off_4 > cb)
                     {}
                    else
                     if(p_off_13 > cb)
                      {}
                     else
                      continue;
                   else
                    if(p_off_13 > cb)
                     if(p_off_14 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                  else
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     if(p_off_15 > cb)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
            else if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     if(p_off_9 < c_b)
                      {}
                     else
                      continue;
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               continue;
             else
              continue;
            else
             continue;
          else
           if(p_off_9 > cb)
            if(p_off_7 > cb)
             if(p_off_8 > cb)
              if(p_off_10 > cb)
               if(p_off_11 > cb)
                if(p_off_6 > cb)
                 if(p_off_5 > cb)
                  if(p_off_4 > cb)
                   if(p_off_3 > cb)
                    {}
                   else
                    if(p_off_12 > cb)
                     {}
                    else
                     continue;
                  else
                   if(p_off_12 > cb)
                    if(p_off_13 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                 else
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    if(p_off_14 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    if(p_off_15 > cb)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                continue;
              else
               continue;
             else
              continue;
            else
             continue;
           else if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    if(p_off_8 < c_b)
                     {}
                    else
                     continue;
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              continue;
            else
             continue;
           else
            continue;
         else
          if(p_off_8 > cb)
           if(p_off_7 > cb)
            if(p_off_9 > cb)
             if(p_off_10 > cb)
              if(p_off_6 > cb)
               if(p_off_5 > cb)
                if(p_off_4 > cb)
                 if(p_off_3 > cb)
                  if(p_off_2 > cb)
                   {}
                  else
                   if(p_off_11 > cb)
                    {}
                   else
                    continue;
                 else
                  if(p_off_11 > cb)
                   if(p_off_12 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   if(p_off_13 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   if(p_off_14 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_11 > cb)
                if(p_off_12 > cb)
                 if(p_off_13 > cb)
                  if(p_off_14 > cb)
                   if(p_off_15 > cb)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              continue;
            else
             continue;
           else
            continue;
          else if(p_off_8 < c_b)
           if(p_off_9 < c_b)
            if(p_off_10 < c_b)
             if(p_off_11 < c_b)
              if(p_off_12 < c_b)
               if(p_off_13 < c_b)
                if(p_off_14 < c_b)
                 if(p_off_15 < c_b)
                  {}
                 else
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                else
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_2 < c_b)
               if(p_off_3 < c_b)
                if(p_off_4 < c_b)
                 if(p_off_5 < c_b)
                  if(p_off_6 < c_b)
                   if(p_off_7 < c_b)
                    {}
                   else
                    continue;
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             continue;
           else
            continue;
          else
           continue;
        else
         if(p_off_7 > cb)
          if(p_off_8 > cb)
           if(p_off_9 > cb)
            if(p_off_6 > cb)
             if(p_off_5 > cb)
              if(p_off_4 > cb)
               if(p_off_3 > cb)
                if(p_off_2 > cb)
                 if(p_off_1 > cb)
                  {}
                 else
                  if(p_off_10 > cb)
                   {}
                  else
                   continue;
                else
                 if(p_off_10 > cb)
                  if(p_off_11 > cb)
                   {}
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_10 > cb)
                 if(p_off_11 > cb)
                  if(p_off_12 > cb)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_10 > cb)
                if(p_off_11 > cb)
                 if(p_off_12 > cb)
                  if(p_off_13 > cb)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_10 > cb)
               if(p_off_11 > cb)
                if(p_off_12 > cb)
                 if(p_off_13 > cb)
                  if(p_off_14 > cb)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             if(p_off_10 > cb)
              if(p_off_11 > cb)
               if(p_off_12 > cb)
                if(p_off_13 > cb)
                 if(p_off_14 > cb)
                  if(p_off_15 > cb)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
           else
            continue;
          else
           continue;
         else if(p_off_7 < c_b)
          if(p_off_8 < c_b)
           if(p_off_9 < c_b)
            if(p_off_6 < c_b)
             if(p_off_5 < c_b)
              if(p_off_4 < c_b)
               if(p_off_3 < c_b)
                if(p_off_2 < c_b)
                 if(p_off_1 < c_b)
                  {}
                 else
                  if(p_off_10 < c_b)
                   {}
                  else
                   continue;
                else
                 if(p_off_10 < c_b)
                  if(p_off_11 < c_b)
                   {}
                  else
                   continue;
                 else
                  continue;
               else
                if(p_off_10 < c_b)
                 if(p_off_11 < c_b)
                  if(p_off_12 < c_b)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
              else
               if(p_off_10 < c_b)
                if(p_off_11 < c_b)
                 if(p_off_12 < c_b)
                  if(p_off_13 < c_b)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
             else
              if(p_off_10 < c_b)
               if(p_off_11 < c_b)
                if(p_off_12 < c_b)
                 if(p_off_13 < c_b)
                  if(p_off_14 < c_b)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
            else
             if(p_off_10 < c_b)
              if(p_off_11 < c_b)
               if(p_off_12 < c_b)
                if(p_off_13 < c_b)
                 if(p_off_14 < c_b)
                  if(p_off_15 < c_b)
                   {}
                  else
                   continue;
                 else
                  continue;
                else
                 continue;
               else
                continue;
              else
               continue;
             else
              continue;
           else
            continue;
          else
           continue;
         else
          continue;
//			if(num_corners == rsize)
//			{
//				rsize*=2;
//				ret_corners = (xy*)realloc(ret_corners, sizeof(xy)*rsize);
//
//			}
//			ret_corners[num_corners].x = x;
//			ret_corners[num_corners].y = y;
//
//
           // num_corners++;
            ret_corners.add(new XY(x,y));

		}
    }

//            long durance=(System.nanoTime()-start)/1000000;
//            System.out.println("detect-durance "+durance);
	ret_num_corners[0] = ret_corners.size();
	return (XY[])ret_corners.toArray(new XY[ret_corners.size()]);

}

}
