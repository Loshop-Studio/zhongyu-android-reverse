.class public Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;,
        Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;,
        Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;,
        Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;
    }
.end annotation


# static fields
.field public static final B:Lg1/g;


# instance fields
.field public A:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

.field public final a:Lf1/q;

.field public final b:Landroid/widget/TextView;

.field public final c:Lf1/j;

.field public final d:Lf1/j;

.field public final e:Lf1/b;

.field public f:Lf1/c;

.field public g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public h:Landroid/widget/LinearLayout;

.field public i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

.field public j:Z

.field public final k:Ljava/util/ArrayList;

.field public final l:Landroid/view/View$OnClickListener;

.field public final m:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field public n:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public o:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public p:Ljava/lang/CharSequence;

.field public q:I

.field public r:I

.field public s:Landroid/graphics/drawable/Drawable;

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:I

.field public v:I

.field public w:I

.field public x:Z

.field public y:I

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lg1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->B:Lg1/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$a;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->l:Landroid/view/View$OnClickListener;

    .line 17
    .line 18
    new-instance v1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->m:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput-object v2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 27
    .line 28
    iput-object v2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->o:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    iput v2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->q:I

    .line 32
    .line 33
    const/high16 v3, -0x1000000

    .line 34
    .line 35
    iput v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->r:I

    .line 36
    .line 37
    const/16 v4, -0xa

    .line 38
    .line 39
    iput v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 40
    .line 41
    iput v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v:I

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    iput v5, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 45
    .line 46
    iput-boolean v5, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->x:Z

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 52
    .line 53
    .line 54
    new-instance v6, Lf1/j;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-direct {v6, v7}, Lf1/j;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    iput-object v6, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    sget v8, Lcom/prolificinteractive/materialcalendarview/R$string;->previous:I

    .line 70
    .line 71
    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v6, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    new-instance v7, Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-direct {v7, v8}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    iput-object v7, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->b:Landroid/widget/TextView;

    .line 88
    .line 89
    new-instance v8, Lf1/j;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-direct {v8, v9}, Lf1/j;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    iput-object v8, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    sget v10, Lcom/prolificinteractive/materialcalendarview/R$string;->next:I

    .line 105
    .line 106
    invoke-virtual {v9, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v8, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    new-instance v9, Lf1/b;

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-direct {v9, v10}, Lf1/b;-><init>(Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    iput-object v9, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 123
    .line 124
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lf1/q;

    .line 131
    .line 132
    invoke-direct {v0, v7}, Lf1/q;-><init>(Landroid/widget/TextView;)V

    .line 133
    .line 134
    .line 135
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->a:Lf1/q;

    .line 136
    .line 137
    sget-object v6, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->B:Lg1/g;

    .line 138
    .line 139
    invoke-virtual {v0, v6}, Lf1/q;->l(Lg1/g;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v1}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$c;

    .line 146
    .line 147
    invoke-direct {v1, p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$c;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v2, v1}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    sget-object v6, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView:[I

    .line 158
    .line 159
    invoke-virtual {v1, p2, v6, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    :try_start_0
    sget v1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_calendarMode:I

    .line 164
    .line 165
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    sget v6, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_firstDayOfWeek:I

    .line 170
    .line 171
    const/4 v7, -0x1

    .line 172
    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    iput v6, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y:I

    .line 177
    .line 178
    sget v6, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_titleAnimationOrientation:I

    .line 179
    .line 180
    invoke-virtual {p2, v6, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-virtual {v0, v2}, Lf1/q;->j(I)V

    .line 185
    .line 186
    .line 187
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y:I

    .line 188
    .line 189
    if-gez v0, :cond_0

    .line 190
    .line 191
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    iput v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y:I

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :catchall_0
    move-exception p1

    .line 203
    goto/16 :goto_4

    .line 204
    .line 205
    :catch_0
    move-exception p1

    .line 206
    goto/16 :goto_2

    .line 207
    .line 208
    :cond_0
    :goto_0
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_showWeekDays:I

    .line 209
    .line 210
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    iput-boolean v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 215
    .line 216
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y:I

    .line 221
    .line 222
    invoke-virtual {v0, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->j(I)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {}, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->values()[Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    aget-object v1, v2, v1

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->i(Lcom/prolificinteractive/materialcalendarview/CalendarMode;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget-boolean v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->m(Z)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g()V

    .line 243
    .line 244
    .line 245
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_tileSize:I

    .line 246
    .line 247
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-le v0, v4, :cond_1

    .line 252
    .line 253
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileSize(I)V

    .line 254
    .line 255
    .line 256
    :cond_1
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_tileWidth:I

    .line 257
    .line 258
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-le v0, v4, :cond_2

    .line 263
    .line 264
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileWidth(I)V

    .line 265
    .line 266
    .line 267
    :cond_2
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_tileHeight:I

    .line 268
    .line 269
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-le v0, v4, :cond_3

    .line 274
    .line 275
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileHeight(I)V

    .line 276
    .line 277
    .line 278
    :cond_3
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_arrowColor:I

    .line 279
    .line 280
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setArrowColor(I)V

    .line 285
    .line 286
    .line 287
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_leftArrowMask:I

    .line 288
    .line 289
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-nez v0, :cond_4

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    sget v1, Lcom/prolificinteractive/materialcalendarview/R$drawable;->mcv_action_previous:I

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    :cond_4
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setLeftArrowMask(Landroid/graphics/drawable/Drawable;)V

    .line 306
    .line 307
    .line 308
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_rightArrowMask:I

    .line 309
    .line 310
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-nez v0, :cond_5

    .line 315
    .line 316
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    sget v1, Lcom/prolificinteractive/materialcalendarview/R$drawable;->mcv_action_next:I

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :cond_5
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setRightArrowMask(Landroid/graphics/drawable/Drawable;)V

    .line 327
    .line 328
    .line 329
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_selectionColor:I

    .line 330
    .line 331
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v(Landroid/content/Context;)I

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectionColor(I)V

    .line 340
    .line 341
    .line 342
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_weekDayLabels:I

    .line 343
    .line 344
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    if-eqz p1, :cond_6

    .line 349
    .line 350
    new-instance v0, Lg1/a;

    .line 351
    .line 352
    invoke-direct {v0, p1}, Lg1/a;-><init>([Ljava/lang/CharSequence;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayFormatter(Lg1/h;)V

    .line 356
    .line 357
    .line 358
    :cond_6
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_monthLabels:I

    .line 359
    .line 360
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    if-eqz p1, :cond_7

    .line 365
    .line 366
    new-instance v0, Lg1/f;

    .line 367
    .line 368
    invoke-direct {v0, p1}, Lg1/f;-><init>([Ljava/lang/CharSequence;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleFormatter(Lg1/g;)V

    .line 372
    .line 373
    .line 374
    :cond_7
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_headerTextAppearance:I

    .line 375
    .line 376
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$style;->TextAppearance_MaterialCalendarWidget_Header:I

    .line 377
    .line 378
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setHeaderTextAppearance(I)V

    .line 383
    .line 384
    .line 385
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_weekDayTextAppearance:I

    .line 386
    .line 387
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$style;->TextAppearance_MaterialCalendarWidget_WeekDay:I

    .line 388
    .line 389
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayTextAppearance(I)V

    .line 394
    .line 395
    .line 396
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_dateTextAppearance:I

    .line 397
    .line 398
    sget v0, Lcom/prolificinteractive/materialcalendarview/R$style;->TextAppearance_MaterialCalendarWidget_Date:I

    .line 399
    .line 400
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setDateTextAppearance(I)V

    .line 405
    .line 406
    .line 407
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_showOtherDates:I

    .line 408
    .line 409
    const/4 v0, 0x4

    .line 410
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setShowOtherDates(I)V

    .line 415
    .line 416
    .line 417
    sget p1, Lcom/prolificinteractive/materialcalendarview/R$styleable;->MaterialCalendarView_mcv_allowClickDaysOutsideCurrentMonth:I

    .line 418
    .line 419
    invoke-virtual {p2, p1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 420
    .line 421
    .line 422
    move-result p1

    .line 423
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setAllowClickDaysOutsideCurrentMonth(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 424
    .line 425
    .line 426
    :goto_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 427
    .line 428
    .line 429
    goto :goto_3

    .line 430
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 431
    .line 432
    .line 433
    goto :goto_1

    .line 434
    :goto_3
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 435
    .line 436
    sget-object p2, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->B:Lg1/g;

    .line 437
    .line 438
    invoke-virtual {p1, p2}, Lf1/c;->y(Lg1/g;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->H()V

    .line 442
    .line 443
    .line 444
    invoke-static {}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->q()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 449
    .line 450
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    if-eqz p1, :cond_8

    .line 458
    .line 459
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 460
    .line 461
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 462
    .line 463
    .line 464
    new-instance p1, Lf1/l;

    .line 465
    .line 466
    iget-object p2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 467
    .line 468
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getFirstDayOfWeek()I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-direct {p1, p0, p2, v0, v5}, Lf1/l;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;IZ)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectionColor()I

    .line 476
    .line 477
    .line 478
    move-result p2

    .line 479
    invoke-virtual {p1, p2}, Lf1/d;->setSelectionColor(I)V

    .line 480
    .line 481
    .line 482
    iget-object p2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 483
    .line 484
    invoke-virtual {p2}, Lf1/c;->d()I

    .line 485
    .line 486
    .line 487
    move-result p2

    .line 488
    invoke-virtual {p1, p2}, Lf1/d;->setDateTextAppearance(I)V

    .line 489
    .line 490
    .line 491
    iget-object p2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 492
    .line 493
    invoke-virtual {p2}, Lf1/c;->j()I

    .line 494
    .line 495
    .line 496
    move-result p2

    .line 497
    invoke-virtual {p1, p2}, Lf1/d;->setWeekDayTextAppearance(I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getShowOtherDates()I

    .line 501
    .line 502
    .line 503
    move-result p2

    .line 504
    invoke-virtual {p1, p2}, Lf1/d;->setShowOtherDates(I)V

    .line 505
    .line 506
    .line 507
    new-instance p2, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 508
    .line 509
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 510
    .line 511
    iget v0, v0, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->a:I

    .line 512
    .line 513
    add-int/2addr v0, v5

    .line 514
    invoke-direct {p2, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 518
    .line 519
    .line 520
    :cond_8
    return-void

    .line 521
    :goto_4
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 522
    .line 523
    .line 524
    throw p1
.end method

.method public static I(I)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static J(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static K(I)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lf1/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lf1/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lf1/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->o(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic g(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lf1/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->a:Lf1/q;

    .line 2
    .line 3
    return-object p0
.end method

.method private getWeekCountBasedOnMode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 2
    .line 3
    iget v1, v0, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->a:I

    .line 4
    .line 5
    sget-object v2, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->b:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->j:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lf1/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->h()Ljava/util/Calendar;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/util/Calendar;

    .line 43
    .line 44
    const/4 v1, 0x5

    .line 45
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getFirstDayOfWeek()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x4

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    :cond_0
    iget-boolean v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    add-int/2addr v1, v2

    .line 72
    :cond_1
    return v1
.end method

.method public static synthetic h(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lf1/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static m(II)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/high16 v1, 0x40000000    # 2.0f

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    return p1

    .line 19
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static v(Landroid/content/Context;)I
    .locals 3

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x1

    .line 11
    const v2, 0x1010435

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 15
    .line 16
    .line 17
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 18
    .line 19
    return p0
.end method


# virtual methods
.method public A(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_5

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 11
    .line 12
    invoke-virtual {p2}, Lf1/c;->a()V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 16
    .line 17
    invoke-virtual {p2, p1, v2}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 25
    .line 26
    invoke-virtual {v0}, Lf1/c;->h()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-ne v1, v2, :cond_4

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 59
    .line 60
    invoke-virtual {v1, p1, p2}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {v0, p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->r(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    invoke-virtual {p0, v0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->r(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 88
    .line 89
    invoke-virtual {v0}, Lf1/c;->a()V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 93
    .line 94
    invoke-virtual {v0, p1, p2}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 102
    .line 103
    invoke-virtual {v0, p1, p2}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public B(Lf1/g;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getCurrentDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lf1/g;->g()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->k()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->k()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget-object v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 18
    .line 19
    sget-object v5, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->b:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 20
    .line 21
    if-ne v4, v5, :cond_1

    .line 22
    .line 23
    iget-boolean v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->x:Z

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->x()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->o(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lf1/g;->g()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->isChecked()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    xor-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-virtual {p0, v0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->A(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public C(Lf1/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public D(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public E(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lf1/c;->e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->M()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public F(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final G(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 4
    .line 5
    invoke-virtual {v1, p1, p2}, Lf1/c;->t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 20
    .line 21
    :goto_0
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lf1/c;->e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object p2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p2, p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->M()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final H()V
    .locals 9

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    new-instance v2, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, v3}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 38
    .line 39
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 45
    .line 46
    iget-object v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 47
    .line 48
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 49
    .line 50
    const/4 v6, -0x1

    .line 51
    const/high16 v7, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-direct {v5, v1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->b:Landroid/widget/TextView;

    .line 60
    .line 61
    const/16 v4, 0x11

    .line 62
    .line 63
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 67
    .line 68
    iget-object v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->b:Landroid/widget/TextView;

    .line 69
    .line 70
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 71
    .line 72
    const/high16 v8, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-direct {v5, v1, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 86
    .line 87
    iget-object v2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 88
    .line 89
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 90
    .line 91
    invoke-direct {v4, v1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 98
    .line 99
    sget v1, Lcom/prolificinteractive/materialcalendarview/R$id;->mcv_pager:I

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 105
    .line 106
    invoke-virtual {v0, v3}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 107
    .line 108
    .line 109
    iget-boolean v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 110
    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 114
    .line 115
    iget v0, v0, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->a:I

    .line 116
    .line 117
    add-int/2addr v0, v3

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 120
    .line 121
    iget v0, v0, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->a:I

    .line 122
    .line 123
    :goto_0
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 124
    .line 125
    new-instance v2, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 126
    .line 127
    invoke-direct {v2, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public L()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->A:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->a:Lf1/q;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf1/q;->f(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->k()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lf1/j;->setEnabled(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->l()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lf1/j;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 2
    .line 3
    return p1
.end method

.method public dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->t()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u(Landroid/util/AttributeSet;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    new-instance p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    return-object p1
.end method

.method public getArrowColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public getCalendarContentDescription()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget v1, Lcom/prolificinteractive/materialcalendarview/R$string;->calendar:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getCalendarMode()Lcom/prolificinteractive/materialcalendarview/CalendarMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lf1/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getFirstDayOfWeek()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public getLeftArrowMask()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaximumDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->o:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMinimumDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRightArrowMask()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->t:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelectedDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf1/c;->h()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 26
    .line 27
    return-object v0
.end method

.method public getSelectedDates()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/prolificinteractive/materialcalendarview/CalendarDay;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf1/c;->h()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSelectionColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectionMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowOtherDates()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf1/c;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getTileHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public getTileSize()I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 2
    .line 3
    iget v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getTileWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public getTitleAnimationOrientation()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->a:Lf1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf1/q;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getTopbarVisible()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public l()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Lf1/c;->getCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v1, v2

    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method public n()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDates()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lf1/c;->a()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p0, v1, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public final o(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->f(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v0, v3}, Lf1/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->a(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eq v3, v4, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 38
    .line 39
    sget-object v5, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->b:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 40
    .line 41
    if-ne v4, v5, :cond_0

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->h()Ljava/util/Calendar;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 50
    .line 51
    .line 52
    invoke-static {v4}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v3, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    invoke-virtual {v3, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->o(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    sget-object v5, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->c:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 76
    .line 77
    if-ne v4, v5, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->h()Ljava/util/Calendar;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const/4 v5, 0x7

    .line 84
    const/4 v6, 0x6

    .line 85
    invoke-virtual {v4, v5, v6}, Ljava/util/Calendar;->add(II)V

    .line 86
    .line 87
    .line 88
    invoke-static {v4}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    invoke-virtual {v3, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_1

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-nez v5, :cond_1

    .line 105
    .line 106
    invoke-virtual {v3, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->o(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    :cond_1
    :goto_0
    move-object v0, v3

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move-object v0, v4

    .line 121
    goto :goto_1

    .line 122
    :cond_3
    const/4 v0, 0x0

    .line 123
    :cond_4
    :goto_1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->A:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    .line 124
    .line 125
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->a(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iput-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->b(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    iput v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y:I

    .line 136
    .line 137
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->c(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iput-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 142
    .line 143
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->d(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    iput-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->o:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 148
    .line 149
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->e(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 154
    .line 155
    sget-object p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$d;->a:[I

    .line 156
    .line 157
    iget-object v3, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    aget p1, p1, v3

    .line 164
    .line 165
    if-eq p1, v2, :cond_6

    .line 166
    .line 167
    if-ne p1, v1, :cond_5

    .line 168
    .line 169
    new-instance p1, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;

    .line 170
    .line 171
    invoke-direct {p1, p0}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    const-string v0, "Provided display mode which is not yet implemented"

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_6
    new-instance p1, Lf1/k;

    .line 184
    .line 185
    invoke-direct {p1, p0}, Lf1/k;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 186
    .line 187
    .line 188
    :goto_2
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 189
    .line 190
    if-nez v1, :cond_7

    .line 191
    .line 192
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    invoke-virtual {v1, p1}, Lf1/c;->o(Lf1/c;)Lf1/c;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 200
    .line 201
    :goto_3
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 202
    .line 203
    iget-boolean v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 204
    .line 205
    invoke-virtual {p1, v1}, Lf1/c;->x(Z)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 209
    .line 210
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 211
    .line 212
    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 216
    .line 217
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->o:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 218
    .line 219
    invoke-virtual {p0, p1, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->G(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 220
    .line 221
    .line 222
    iget-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z:Z

    .line 223
    .line 224
    if-eqz p1, :cond_8

    .line 225
    .line 226
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 227
    .line 228
    iget p1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->a:I

    .line 229
    .line 230
    add-int/2addr p1, v2

    .line 231
    goto :goto_4

    .line 232
    :cond_8
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 233
    .line 234
    iget p1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->a:I

    .line 235
    .line 236
    :goto_4
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 237
    .line 238
    new-instance v3, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 239
    .line 240
    invoke-direct {v3, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 244
    .line 245
    .line 246
    iget p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 247
    .line 248
    if-ne p1, v2, :cond_9

    .line 249
    .line 250
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 251
    .line 252
    invoke-virtual {p1}, Lf1/c;->h()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-nez p1, :cond_9

    .line 261
    .line 262
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 263
    .line 264
    invoke-virtual {p1}, Lf1/c;->h()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    const/4 v1, 0x0

    .line 269
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    check-cast p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_9
    invoke-static {}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->q()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    :goto_5
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 281
    .line 282
    .line 283
    if-eqz v0, :cond_a

    .line 284
    .line 285
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 286
    .line 287
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 288
    .line 289
    invoke-virtual {v1, v0}, Lf1/c;->e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 294
    .line 295
    .line 296
    :cond_a
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->y()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->M()V

    .line 300
    .line 301
    .line 302
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    sub-int/2addr p4, p2

    .line 10
    sub-int/2addr p4, p3

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    sub-int/2addr p4, p2

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 p5, 0x0

    .line 21
    :goto_0
    if-ge p5, p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x8

    .line 32
    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-int v3, p4, v1

    .line 45
    .line 46
    div-int/lit8 v3, v3, 0x2

    .line 47
    .line 48
    add-int/2addr v3, p3

    .line 49
    add-int/2addr v1, v3

    .line 50
    add-int/2addr v2, p2

    .line 51
    invoke-virtual {v0, v3, p2, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 52
    .line 53
    .line 54
    move p2, v2

    .line 55
    :goto_1
    add-int/lit8 p5, p5, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-void
.end method

.method public onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v0, v4

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    sub-int/2addr v0, v4

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    sub-int/2addr v2, v4

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    sub-int/2addr v2, v4

    .line 37
    invoke-direct {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getWeekCountBasedOnMode()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getTopbarVisible()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    :cond_0
    div-int/lit8 v0, v0, 0x7

    .line 50
    .line 51
    div-int/2addr v2, v4

    .line 52
    iget v5, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v:I

    .line 53
    .line 54
    const/16 v6, -0xa

    .line 55
    .line 56
    const/4 v7, -0x1

    .line 57
    const/high16 v8, 0x40000000    # 2.0f

    .line 58
    .line 59
    if-ne v5, v6, :cond_7

    .line 60
    .line 61
    iget v9, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 62
    .line 63
    if-eq v9, v6, :cond_1

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    if-eq v1, v8, :cond_6

    .line 67
    .line 68
    const/high16 v5, -0x80000000

    .line 69
    .line 70
    if-ne v1, v5, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    if-eq v3, v8, :cond_4

    .line 74
    .line 75
    if-ne v3, v5, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move v0, v7

    .line 79
    move v2, v0

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    :goto_0
    move v0, v2

    .line 82
    :cond_5
    :goto_1
    move v2, v7

    .line 83
    goto :goto_4

    .line 84
    :cond_6
    :goto_2
    if-ne v3, v8, :cond_5

    .line 85
    .line 86
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    goto :goto_1

    .line 91
    :cond_7
    :goto_3
    if-lez v5, :cond_8

    .line 92
    .line 93
    move v0, v5

    .line 94
    :cond_8
    iget v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 95
    .line 96
    if-lez v1, :cond_9

    .line 97
    .line 98
    move v2, v7

    .line 99
    move v7, v0

    .line 100
    move v0, v2

    .line 101
    move v2, v1

    .line 102
    goto :goto_4

    .line 103
    :cond_9
    move v10, v7

    .line 104
    move v7, v0

    .line 105
    move v0, v10

    .line 106
    :goto_4
    if-lez v0, :cond_a

    .line 107
    .line 108
    move v2, v0

    .line 109
    goto :goto_6

    .line 110
    :cond_a
    if-gtz v0, :cond_d

    .line 111
    .line 112
    const/16 v0, 0x2c

    .line 113
    .line 114
    if-gtz v7, :cond_b

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s(I)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    goto :goto_5

    .line 121
    :cond_b
    move v1, v7

    .line 122
    :goto_5
    if-gtz v2, :cond_c

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s(I)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    move v2, v0

    .line 129
    :cond_c
    move v0, v1

    .line 130
    goto :goto_6

    .line 131
    :cond_d
    move v0, v7

    .line 132
    :goto_6
    mul-int/lit8 v0, v0, 0x7

    .line 133
    .line 134
    mul-int/2addr v4, v2

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    add-int/2addr v1, v3

    .line 144
    add-int/2addr v1, v0

    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    add-int/2addr v3, v5

    .line 154
    add-int/2addr v4, v3

    .line 155
    invoke-static {v1, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->m(II)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-static {v4, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->m(II)I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    const/4 p2, 0x0

    .line 171
    :goto_7
    if-ge p2, p1, :cond_e

    .line 172
    .line 173
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 182
    .line 183
    invoke-static {v0, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 188
    .line 189
    mul-int/2addr v3, v2

    .line 190
    invoke-static {v3, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->measure(II)V

    .line 195
    .line 196
    .line 197
    add-int/lit8 p2, p2, 0x1

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_e
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->z()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->i:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->j(I)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->p:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->i(Lcom/prolificinteractive/materialcalendarview/CalendarMode;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->f:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->l(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->k(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-boolean v1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->r:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->h(Z)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-boolean v1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->s:Z

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->m(Z)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g()V

    .line 51
    .line 52
    .line 53
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->a:I

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectionColor(I)V

    .line 56
    .line 57
    .line 58
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->b:I

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setDateTextAppearance(I)V

    .line 61
    .line 62
    .line 63
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayTextAppearance(I)V

    .line 66
    .line 67
    .line 68
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->d:I

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setShowOtherDates(I)V

    .line 71
    .line 72
    .line 73
    iget-boolean v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->e:Z

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setAllowClickDaysOutsideCurrentMonth(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->h:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_0

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    invoke-virtual {p0, v1, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->F(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->j:I

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleAnimationOrientation(I)V

    .line 107
    .line 108
    .line 109
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->k:I

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileWidth(I)V

    .line 112
    .line 113
    .line 114
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->l:I

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileHeight(I)V

    .line 117
    .line 118
    .line 119
    iget-boolean v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->m:Z

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTopbarVisible(Z)V

    .line 122
    .line 123
    .line 124
    iget v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->n:I

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectionMode(I)V

    .line 127
    .line 128
    .line 129
    iget-boolean v0, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->o:Z

    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setDynamicHeightEnabled(Z)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->q:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectionColor()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->a:I

    .line 15
    .line 16
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 17
    .line 18
    invoke-virtual {v1}, Lf1/c;->d()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->b:I

    .line 23
    .line 24
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 25
    .line 26
    invoke-virtual {v1}, Lf1/c;->j()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->c:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getShowOtherDates()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->d:I

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->j()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput-boolean v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->e:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getMinimumDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->f:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getMaximumDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDates()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->h:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getFirstDayOfWeek()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->i:I

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getTitleAnimationOrientation()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->j:I

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectionMode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->n:I

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getTileWidth()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->k:I

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getTileHeight()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iput v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->l:I

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getTopbarVisible()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iput-boolean v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->m:Z

    .line 97
    .line 98
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 99
    .line 100
    iput-object v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->p:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 101
    .line 102
    iget-boolean v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->j:Z

    .line 103
    .line 104
    iput-boolean v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->o:Z

    .line 105
    .line 106
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 107
    .line 108
    iput-object v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->q:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 109
    .line 110
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->A:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    .line 111
    .line 112
    invoke-static {v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->f(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iput-boolean v1, v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$SavedState;->r:Z

    .line 117
    .line 118
    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()Ljava/util/Date;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()Ljava/util/Date;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    :goto_1
    invoke-static {v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iget-object v2, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-virtual {v2, p2, v3}, Lf1/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    const/4 p2, 0x5

    .line 56
    invoke-virtual {v1, p2, v3}, Ljava/util/Calendar;->add(II)V

    .line 57
    .line 58
    .line 59
    goto :goto_0
.end method

.method public final s(I)I
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    float-to-int p1, p1

    .line 16
    return p1
.end method

.method public setAllowClickDaysOutsideCurrentMonth(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->x:Z

    .line 2
    .line 3
    return-void
.end method

.method public setArrowColor(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->r:I

    .line 5
    .line 6
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lf1/j;->b(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lf1/j;->b(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setContentDescriptionArrowFuture(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setContentDescriptionArrowPast(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setContentDescriptionCalendar(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->p:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method public setCurrentDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 1
    .param p1    # Lcom/prolificinteractive/materialcalendarview/CalendarDay;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->E(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    return-void
.end method

.method public setCurrentDate(Ljava/util/Calendar;)V
    .locals 0
    .param p1    # Ljava/util/Calendar;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    return-void
.end method

.method public setCurrentDate(Ljava/util/Date;)V
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f(Ljava/util/Date;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    return-void
.end method

.method public setDateTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf1/c;->q(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDayFormatter(Lg1/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lg1/e;->a:Lg1/e;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Lf1/c;->r(Lg1/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setDayFormatterContentDescription(Lg1/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf1/c;->s(Lg1/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDynamicHeightEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHeaderTextAppearance(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setLeftArrowMask(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->c:Lf1/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setOnDateChangedListener(Lf1/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnDateLongClickListener(Lf1/m;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnMonthChangedListener(Lf1/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnRangeSelectedListener(Lf1/p;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnTitleClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPagingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf1/b;->a(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->M()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setRightArrowMask(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->t:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d:Lf1/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 1
    .param p1    # Lcom/prolificinteractive/materialcalendarview/CalendarDay;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->F(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    :cond_0
    return-void
.end method

.method public setSelectedDate(Ljava/util/Calendar;)V
    .locals 0
    .param p1    # Ljava/util/Calendar;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    return-void
.end method

.method public setSelectedDate(Ljava/util/Date;)V
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f(Ljava/util/Date;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    return-void
.end method

.method public setSelectionColor(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const p1, -0x777778

    .line 11
    .line 12
    .line 13
    :cond_1
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->q:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lf1/c;->u(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setSelectionMode(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 2
    .line 3
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eq p1, v4, :cond_1

    .line 10
    .line 11
    if-eq p1, v3, :cond_3

    .line 12
    .line 13
    if-eq p1, v2, :cond_0

    .line 14
    .line 15
    iput v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->n()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-eq v0, v3, :cond_2

    .line 28
    .line 29
    if-ne v0, v2, :cond_3

    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDates()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 49
    .line 50
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->w:I

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    move v1, v4

    .line 55
    :cond_4
    invoke-virtual {p1, v1}, Lf1/c;->v(Z)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public setShowOtherDates(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf1/c;->w(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTileHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTileHeightDp(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileHeight(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTileSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v:I

    .line 2
    .line 3
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->u:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTileSizeDp(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileSize(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTileWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->v:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTileWidthDp(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTileWidth(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTitleAnimationOrientation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->a:Lf1/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf1/q;->j(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleFormatter(Lg1/g;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->B:Lg1/g;

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->a:Lf1/q;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lf1/q;->l(Lg1/g;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lf1/c;->y(Lg1/g;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->M()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setTitleMonths(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ArrayRes;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleMonths([Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleMonths([Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    new-instance v0, Lg1/f;

    invoke-direct {v0, p1}, Lg1/f;-><init>([Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleFormatter(Lg1/g;)V

    return-void
.end method

.method public setTopbarVisible(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/16 p1, 0x8

    .line 8
    .line 9
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setWeekDayFormatter(Lg1/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lg1/h;->a:Lg1/h;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Lf1/c;->z(Lg1/h;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setWeekDayLabels(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ArrayRes;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayLabels([Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setWeekDayLabels([Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    new-instance v0, Lg1/a;

    invoke-direct {v0, p1}, Lg1/a;-><init>([Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayFormatter(Lg1/h;)V

    return-void
.end method

.method public setWeekDayTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf1/c;->A(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;
    .locals 2

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public u(Landroid/util/AttributeSet;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;
    .locals 1

    .line 1
    new-instance p1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object p1
.end method

.method public w()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    add-int/2addr v1, v2

    .line 15
    invoke-virtual {v0, v1, v2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public x()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e:Lf1/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v1, v2

    .line 15
    invoke-virtual {v0, v1, v2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f:Lf1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf1/c;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 1

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
