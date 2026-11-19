.class public final Lcom/alibaba/fastjson/parser/JSONScanner;
.super Lcom/alibaba/fastjson/parser/JSONLexerBase;
.source "SourceFile"


# instance fields
.field private final len:I

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, Lcom/alibaba/fastjson/JSON;->DEFAULT_PARSER_FEATURE:I

    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;-><init>(I)V

    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 6
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 7
    iget-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const p2, 0xfeff

    if-ne p1, p2, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    :cond_0
    return-void
.end method

.method public constructor <init>([CI)V
    .locals 1

    .line 9
    sget v0, Lcom/alibaba/fastjson/JSON;->DEFAULT_PARSER_FEATURE:I

    invoke-direct {p0, p1, p2, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;-><init>([CII)V

    return-void
.end method

.method public constructor <init>([CII)V
    .locals 2

    .line 10
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2}, Ljava/lang/String;-><init>([CII)V

    invoke-direct {p0, v0, p3}, Lcom/alibaba/fastjson/parser/JSONScanner;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static charArrayCompare(Ljava/lang/String;I[C)Z
    .locals 5

    .line 1
    array-length v0, p2

    add-int v1, v0, p1

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return v3

    :cond_0
    move v1, v3

    :goto_0
    if-ge v1, v0, :cond_2

    .line 3
    aget-char v2, p2, v1

    add-int v4, p1, v1

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v2, v4, :cond_1

    return v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static checkDate(CCCCCCII)Z
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x30

    if-lt p0, v1, :cond_d

    const/16 v2, 0x39

    if-le p0, v2, :cond_0

    goto :goto_1

    :cond_0
    if-lt p1, v1, :cond_d

    if-le p1, v2, :cond_1

    goto :goto_1

    :cond_1
    if-lt p2, v1, :cond_d

    if-le p2, v2, :cond_2

    goto :goto_1

    :cond_2
    if-lt p3, v1, :cond_d

    if-le p3, v2, :cond_3

    goto :goto_1

    :cond_3
    const/16 p0, 0x32

    const/16 p1, 0x31

    if-ne p4, v1, :cond_5

    if-lt p5, p1, :cond_4

    if-le p5, v2, :cond_6

    :cond_4
    return v0

    :cond_5
    if-ne p4, p1, :cond_d

    if-eq p5, v1, :cond_6

    if-eq p5, p1, :cond_6

    if-eq p5, p0, :cond_6

    return v0

    :cond_6
    if-ne p6, v1, :cond_8

    if-lt p7, p1, :cond_7

    if-le p7, v2, :cond_c

    :cond_7
    return v0

    :cond_8
    if-eq p6, p1, :cond_b

    if-ne p6, p0, :cond_9

    goto :goto_0

    :cond_9
    const/16 p0, 0x33

    if-ne p6, p0, :cond_a

    if-eq p7, v1, :cond_c

    if-eq p7, p1, :cond_c

    :cond_a
    return v0

    :cond_b
    :goto_0
    if-lt p7, v1, :cond_d

    if-le p7, v2, :cond_c

    goto :goto_1

    :cond_c
    const/4 p0, 0x1

    return p0

    :cond_d
    :goto_1
    return v0
.end method

.method private checkTime(CCCCCC)Z
    .locals 4

    const/16 v0, 0x39

    const/4 v1, 0x0

    const/16 v2, 0x30

    if-ne p1, v2, :cond_1

    if-lt p2, v2, :cond_0

    if-le p2, v0, :cond_4

    :cond_0
    return v1

    :cond_1
    const/16 v3, 0x31

    if-ne p1, v3, :cond_3

    if-lt p2, v2, :cond_2

    if-le p2, v0, :cond_4

    :cond_2
    return v1

    :cond_3
    const/16 v3, 0x32

    if-ne p1, v3, :cond_b

    if-lt p2, v2, :cond_b

    const/16 p1, 0x34

    if-le p2, p1, :cond_4

    goto :goto_0

    :cond_4
    const/16 p1, 0x36

    const/16 p2, 0x35

    if-lt p3, v2, :cond_6

    if-gt p3, p2, :cond_6

    if-lt p4, v2, :cond_5

    if-le p4, v0, :cond_7

    :cond_5
    return v1

    :cond_6
    if-ne p3, p1, :cond_b

    if-eq p4, v2, :cond_7

    return v1

    :cond_7
    if-lt p5, v2, :cond_9

    if-gt p5, p2, :cond_9

    if-lt p6, v2, :cond_8

    if-le p6, v0, :cond_a

    :cond_8
    return v1

    :cond_9
    if-ne p5, p1, :cond_b

    if-eq p6, v2, :cond_a

    return v1

    :cond_a
    const/4 p1, 0x1

    return p1

    :cond_b
    :goto_0
    return v1
.end method

.method private scanISO8601DateIfMatch(ZI)Z
    .locals 41

    move-object/from16 v0, p0

    move/from16 v9, p2

    const/4 v10, 0x0

    const/16 v11, 0x8

    if-ge v9, v11, :cond_0

    return v10

    .line 4
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 5
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v20, 0x1

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v13

    .line 6
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/4 v12, 0x2

    add-int/2addr v2, v12

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v14

    .line 7
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/4 v15, 0x3

    add-int/2addr v2, v15

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v4

    .line 8
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    .line 9
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/4 v5, 0x5

    add-int/2addr v3, v5

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    .line 10
    iget v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v16, 0x6

    add-int/lit8 v6, v6, 0x6

    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v6

    .line 11
    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v7, v7, 0x7

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    const/16 v8, 0x39

    move/from16 v17, v12

    const/16 v12, 0x30

    if-nez p1, :cond_6

    move/from16 v18, v15

    const/16 v15, 0xd

    if-le v9, v15, :cond_5

    .line 12
    iget v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v15, v9

    add-int/lit8 v15, v15, -0x1

    invoke-virtual {v0, v15}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v15

    move/from16 v21, v10

    .line 13
    iget v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v10, v9

    add-int/lit8 v10, v10, -0x2

    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v10

    const/16 v11, 0x2f

    if-ne v1, v11, :cond_7

    const/16 v11, 0x44

    if-ne v13, v11, :cond_7

    const/16 v11, 0x61

    if-ne v14, v11, :cond_7

    const/16 v11, 0x74

    if-ne v4, v11, :cond_7

    const/16 v11, 0x65

    if-ne v2, v11, :cond_7

    const/16 v11, 0x28

    if-ne v3, v11, :cond_7

    const/16 v11, 0x2f

    if-ne v15, v11, :cond_7

    const/16 v11, 0x29

    if-ne v10, v11, :cond_7

    const/4 v1, -0x1

    move/from16 v2, v16

    :goto_0
    if-ge v2, v9, :cond_3

    .line 14
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v2

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    const/16 v4, 0x2b

    if-ne v3, v4, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    if-lt v3, v12, :cond_3

    if-le v3, v8, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    const/4 v2, -0x1

    if-ne v1, v2, :cond_4

    return v21

    .line 15
    :cond_4
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v3, v2, 0x6

    add-int/2addr v2, v1

    sub-int/2addr v2, v3

    .line 16
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 18
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->timeZone:Ljava/util/TimeZone;

    iget-object v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->locale:Ljava/util/Locale;

    invoke-static {v3, v4}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v3

    iput-object v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 19
    invoke-virtual {v3, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 20
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v20

    :cond_5
    move/from16 v21, v10

    goto :goto_3

    :cond_6
    move/from16 v21, v10

    move/from16 v18, v15

    :cond_7
    :goto_3
    const/16 v10, 0x10

    const/16 v12, 0x54

    const/16 v11, 0xe

    const/16 v15, 0x2d

    const/16 v26, 0xa

    const/16 v5, 0x8

    if-eq v9, v5, :cond_9

    if-eq v9, v11, :cond_9

    if-ne v9, v10, :cond_a

    .line 21
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v5, v5, 0xa

    .line 22
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    if-eq v5, v12, :cond_9

    const/16 v8, 0x20

    if-eq v5, v8, :cond_8

    goto :goto_6

    :cond_8
    :goto_4
    const/16 v10, 0x30

    const/16 v11, 0x39

    :goto_5
    const/16 v19, 0xb

    const/16 v27, 0x5

    goto/16 :goto_23

    :cond_9
    move v11, v8

    const/16 v8, 0x20

    const/16 v10, 0x30

    goto :goto_5

    :cond_a
    :goto_6
    const/16 v5, 0x11

    if-ne v9, v5, :cond_b

    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v5, v5, 0x6

    .line 23
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    if-eq v5, v15, :cond_b

    const/16 v8, 0x20

    goto :goto_4

    :cond_b
    const/16 v5, 0x9

    if-ge v9, v5, :cond_c

    return v21

    .line 24
    :cond_c
    iget v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v22, 0x8

    add-int/lit8 v8, v8, 0x8

    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v8

    move/from16 v24, v5

    .line 25
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v5, v5, 0x9

    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    const/16 v10, 0x65e5

    if-ne v2, v15, :cond_e

    if-eq v7, v15, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    const/16 v11, 0x20

    goto :goto_9

    :cond_e
    :goto_8
    const/16 v11, 0x2f

    if-ne v2, v11, :cond_10

    const/16 v11, 0x2f

    if-ne v7, v11, :cond_10

    goto :goto_7

    :goto_9
    if-ne v5, v11, :cond_f

    move/from16 v32, v1

    move/from16 v36, v3

    move/from16 v35, v4

    move/from16 v37, v6

    move/from16 v39, v8

    move/from16 v33, v13

    move/from16 v34, v14

    const/16 v11, 0x9

    :goto_a
    const/16 v38, 0x30

    goto/16 :goto_15

    :cond_f
    move/from16 v32, v1

    move/from16 v36, v3

    move/from16 v35, v4

    move/from16 v39, v5

    move/from16 v37, v6

    move/from16 v38, v8

    move/from16 v33, v13

    move/from16 v34, v14

    :goto_b
    move/from16 v11, v26

    goto/16 :goto_15

    :cond_10
    const/16 v11, 0x20

    if-ne v2, v15, :cond_12

    if-ne v6, v15, :cond_12

    if-ne v8, v11, :cond_11

    move/from16 v32, v1

    move/from16 v37, v3

    move/from16 v35, v4

    move/from16 v39, v7

    move/from16 v33, v13

    move/from16 v34, v14

    const/16 v11, 0x8

    :goto_c
    const/16 v36, 0x30

    goto :goto_a

    :cond_11
    move/from16 v32, v1

    move/from16 v37, v3

    move/from16 v35, v4

    move/from16 v38, v7

    move/from16 v39, v8

    move/from16 v33, v13

    move/from16 v34, v14

    const/16 v11, 0x9

    :goto_d
    const/16 v36, 0x30

    goto/16 :goto_15

    :cond_12
    const/16 v11, 0x2e

    if-ne v14, v11, :cond_13

    const/16 v11, 0x2e

    if-eq v3, v11, :cond_14

    :cond_13
    if-ne v14, v15, :cond_15

    if-ne v3, v15, :cond_15

    :cond_14
    move/from16 v38, v1

    move/from16 v37, v2

    move/from16 v36, v4

    move/from16 v35, v5

    move/from16 v32, v6

    move/from16 v33, v7

    move/from16 v34, v8

    move/from16 v39, v13

    goto :goto_b

    :cond_15
    if-ne v8, v12, :cond_16

    move/from16 v32, v1

    move/from16 v36, v2

    move/from16 v37, v3

    move/from16 v35, v4

    move/from16 v38, v6

    move/from16 v39, v7

    move/from16 v33, v13

    move/from16 v34, v14

    const/16 v11, 0x8

    goto/16 :goto_15

    :cond_16
    const/16 v11, 0x5e74

    if-eq v2, v11, :cond_18

    const v11, 0xb144

    if-ne v2, v11, :cond_17

    goto :goto_e

    :cond_17
    return v21

    :cond_18
    :goto_e
    const/16 v2, 0x6708

    if-eq v7, v2, :cond_19

    const v2, 0xc6d4

    if-ne v7, v2, :cond_1a

    :cond_19
    const v2, 0xc77c

    goto :goto_12

    :cond_1a
    const/16 v2, 0x6708

    if-eq v6, v2, :cond_1c

    const v2, 0xc6d4

    if-ne v6, v2, :cond_1b

    goto :goto_f

    :cond_1b
    return v21

    :cond_1c
    :goto_f
    const v2, 0xc77c

    if-eq v8, v10, :cond_20

    if-ne v8, v2, :cond_1d

    goto :goto_11

    :cond_1d
    if-eq v5, v10, :cond_1f

    if-ne v5, v2, :cond_1e

    goto :goto_10

    :cond_1e
    return v21

    :cond_1f
    :goto_10
    move/from16 v32, v1

    move/from16 v37, v3

    move/from16 v35, v4

    move/from16 v38, v7

    move/from16 v39, v8

    move/from16 v33, v13

    move/from16 v34, v14

    move/from16 v11, v26

    goto :goto_d

    :cond_20
    :goto_11
    move/from16 v32, v1

    move/from16 v37, v3

    move/from16 v35, v4

    move/from16 v39, v7

    move/from16 v33, v13

    move/from16 v34, v14

    move/from16 v11, v26

    goto/16 :goto_c

    :goto_12
    if-eq v5, v10, :cond_24

    if-ne v5, v2, :cond_21

    goto :goto_14

    .line 26
    :cond_21
    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v7, v7, 0xa

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    if-eq v7, v10, :cond_23

    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v7, v7, 0xa

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    if-ne v7, v2, :cond_22

    goto :goto_13

    :cond_22
    return v21

    :cond_23
    :goto_13
    move/from16 v32, v1

    move/from16 v36, v3

    move/from16 v35, v4

    move/from16 v39, v5

    move/from16 v37, v6

    move/from16 v38, v8

    move/from16 v33, v13

    move/from16 v34, v14

    const/16 v11, 0xb

    goto :goto_15

    :cond_24
    :goto_14
    move/from16 v32, v1

    move/from16 v36, v3

    move/from16 v35, v4

    move/from16 v37, v6

    move/from16 v39, v8

    move/from16 v33, v13

    move/from16 v34, v14

    move/from16 v11, v26

    goto/16 :goto_a

    .line 27
    :goto_15
    invoke-static/range {v32 .. v39}, Lcom/alibaba/fastjson/parser/JSONScanner;->checkDate(CCCCCCII)Z

    move-result v1

    move/from16 v6, v32

    move/from16 v2, v33

    move/from16 v3, v34

    move/from16 v4, v35

    move/from16 v5, v36

    move/from16 v7, v37

    move/from16 v8, v38

    move/from16 v13, v39

    if-nez v1, :cond_25

    return v21

    :cond_25
    move v1, v6

    move v6, v7

    move v7, v8

    move v8, v13

    const/16 v13, 0x39

    const/4 v14, 0x5

    .line 28
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->setCalendar(CCCCCCCC)V

    .line 29
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    if-ne v7, v12, :cond_28

    const/16 v1, 0x10

    if-ne v9, v1, :cond_28

    const/16 v5, 0x8

    if-ne v11, v5, :cond_28

    .line 30
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0xf

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    const/16 v2, 0x5a

    if-ne v1, v2, :cond_28

    .line 31
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 32
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    .line 33
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0x3

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    .line 34
    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v4, v11

    add-int/lit8 v4, v4, 0x4

    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v4

    .line 35
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v5, v11

    add-int/2addr v5, v14

    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    .line 36
    iget v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v6, v11

    add-int/lit8 v6, v6, 0x6

    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v6

    .line 37
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->checkTime(CCCCCC)Z

    move-result v7

    if-nez v7, :cond_26

    return v21

    :cond_26
    move-object/from16 v0, p0

    .line 38
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->setTime(CCCCCC)V

    .line 39
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    move/from16 v3, v21

    const/16 v2, 0xe

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 40
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v1

    if-eqz v1, :cond_27

    .line 41
    invoke-static {v3}, Ljava/util/TimeZone;->getAvailableIDs(I)[Ljava/lang/String;

    move-result-object v1

    .line 42
    array-length v2, v1

    if-lez v2, :cond_27

    .line 43
    aget-object v1, v1, v3

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    .line 44
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 45
    :cond_27
    iput v14, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v20

    :cond_28
    if-eq v7, v12, :cond_31

    const/16 v8, 0x20

    if-ne v7, v8, :cond_29

    if-nez p1, :cond_29

    goto/16 :goto_19

    :cond_29
    const/16 v1, 0x22

    if-eq v7, v1, :cond_2a

    const/16 v1, 0x1a

    if-eq v7, v1, :cond_2a

    if-eq v7, v10, :cond_2a

    const v2, 0xc77c

    if-ne v7, v2, :cond_2b

    :cond_2a
    const/4 v3, 0x0

    goto :goto_18

    :cond_2b
    const/16 v1, 0x2b

    if-eq v7, v1, :cond_2d

    if-ne v7, v15, :cond_2c

    goto :goto_16

    :cond_2c
    const/16 v21, 0x0

    return v21

    .line 46
    :cond_2d
    :goto_16
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    add-int/lit8 v2, v11, 0x6

    if-ne v1, v2, :cond_30

    .line 47
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    const/16 v2, 0x3a

    if-ne v1, v2, :cond_2e

    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x4

    .line 48
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_2e

    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/2addr v1, v14

    .line 49
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    if-eq v1, v2, :cond_2f

    :cond_2e
    const/4 v3, 0x0

    goto :goto_17

    :cond_2f
    const/16 v5, 0x30

    const/16 v6, 0x30

    const/16 v1, 0x30

    const/16 v2, 0x30

    const/16 v3, 0x30

    const/16 v4, 0x30

    .line 50
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->setTime(CCCCCC)V

    .line 51
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xe

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 52
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v7, v1, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->setTimeZone(CCC)V

    return v20

    :goto_17
    return v3

    :cond_30
    const/4 v3, 0x0

    return v3

    .line 53
    :goto_18
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xb

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 54
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xc

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 55
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xd

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 56
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xe

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 57
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 58
    iput v14, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v20

    :cond_31
    :goto_19
    add-int/lit8 v1, v11, 0x9

    if-ge v9, v1, :cond_32

    const/16 v21, 0x0

    return v21

    :cond_32
    const/16 v21, 0x0

    .line 59
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_33

    return v21

    .line 60
    :cond_33
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x6

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    if-eq v1, v2, :cond_34

    return v21

    .line 61
    :cond_34
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 62
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    .line 63
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    .line 64
    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v4, v11

    add-int/2addr v4, v14

    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v4

    .line 65
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v5, v11

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    .line 66
    iget v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v6, v11

    const/16 v22, 0x8

    add-int/lit8 v6, v6, 0x8

    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v6

    .line 67
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->checkTime(CCCCCC)Z

    move-result v7

    if-nez v7, :cond_35

    const/16 v21, 0x0

    return v21

    :cond_35
    move-object/from16 v0, p0

    const/16 v21, 0x0

    .line 68
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->setTime(CCCCCC)V

    .line 69
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    const/16 v24, 0x9

    add-int/lit8 v1, v1, 0x9

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    const/16 v2, 0x2e

    if-ne v1, v2, :cond_3a

    add-int/lit8 v1, v11, 0xb

    if-ge v9, v1, :cond_36

    return v21

    .line 70
    :cond_36
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0xa

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_37

    if-le v2, v13, :cond_38

    :cond_37
    const/16 v21, 0x0

    goto :goto_1b

    :cond_38
    sub-int/2addr v2, v3

    if-le v9, v1, :cond_39

    .line 71
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    const/16 v19, 0xb

    add-int/lit8 v1, v1, 0xb

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    if-lt v1, v3, :cond_39

    if-gt v1, v13, :cond_39

    mul-int/lit8 v2, v2, 0xa

    sub-int/2addr v1, v3

    add-int/2addr v2, v1

    move/from16 v1, v17

    move v3, v1

    goto :goto_1a

    :cond_39
    move/from16 v3, v17

    move/from16 v1, v20

    :goto_1a
    if-ne v1, v3, :cond_3b

    .line 72
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0xc

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_3b

    if-gt v3, v13, :cond_3b

    mul-int/lit8 v2, v2, 0xa

    sub-int/2addr v3, v4

    add-int v1, v2, v3

    move v2, v1

    move/from16 v1, v18

    goto :goto_1c

    :goto_1b
    return v21

    :cond_3a
    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 73
    :cond_3b
    :goto_1c
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v4, 0xe

    invoke-virtual {v3, v4, v2}, Ljava/util/Calendar;->set(II)V

    .line 74
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    const/16 v8, 0x20

    if-ne v2, v8, :cond_3c

    add-int/lit8 v1, v1, 0x1

    .line 75
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    :cond_3c
    move v6, v1

    move v1, v2

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_40

    if-ne v1, v15, :cond_3d

    goto :goto_1d

    :cond_3d
    const/16 v2, 0x5a

    if-ne v1, v2, :cond_3f

    .line 76
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v1

    if-eqz v1, :cond_3e

    const/16 v21, 0x0

    .line 77
    invoke-static/range {v21 .. v21}, Ljava/util/TimeZone;->getAvailableIDs(I)[Ljava/lang/String;

    move-result-object v1

    .line 78
    array-length v2, v1

    if-lez v2, :cond_3e

    .line 79
    aget-object v1, v1, v21

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    .line 80
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_3e
    move/from16 v15, v20

    goto/16 :goto_21

    :cond_3f
    const/4 v15, 0x0

    goto/16 :goto_21

    .line 81
    :cond_40
    :goto_1d
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v2, v11

    add-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v6

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_41

    const/16 v4, 0x31

    if-le v2, v4, :cond_42

    :cond_41
    const/16 v21, 0x0

    goto/16 :goto_22

    .line 82
    :cond_42
    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v4, v11

    add-int/lit8 v4, v4, 0xa

    add-int/2addr v4, v6

    const/16 v17, 0x2

    add-int/lit8 v4, v4, 0x2

    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v4

    if-lt v4, v3, :cond_43

    if-le v4, v13, :cond_44

    :cond_43
    const/16 v21, 0x0

    goto/16 :goto_22

    .line 83
    :cond_44
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v6

    add-int/lit8 v3, v3, 0x3

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    const/16 v5, 0x33

    const/16 v7, 0x3a

    if-ne v3, v7, :cond_4a

    .line 84
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v6

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    .line 85
    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v7, v11

    add-int/lit8 v7, v7, 0xa

    add-int/2addr v7, v6

    add-int/2addr v7, v14

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    const/16 v8, 0x34

    if-ne v3, v8, :cond_47

    const/16 v8, 0x35

    if-ne v7, v8, :cond_47

    const/16 v8, 0x31

    if-ne v2, v8, :cond_45

    const/16 v8, 0x32

    if-eq v4, v8, :cond_49

    if-ne v4, v5, :cond_45

    goto :goto_1e

    :cond_45
    const/16 v5, 0x30

    if-ne v2, v5, :cond_46

    const/16 v5, 0x35

    if-eq v4, v5, :cond_49

    const/16 v5, 0x38

    if-ne v4, v5, :cond_46

    goto :goto_1e

    :cond_46
    const/16 v21, 0x0

    return v21

    :cond_47
    const/16 v21, 0x0

    const/16 v8, 0x30

    if-eq v3, v8, :cond_48

    if-eq v3, v5, :cond_48

    return v21

    :cond_48
    if-eq v7, v8, :cond_49

    return v21

    :cond_49
    :goto_1e
    move v5, v4

    move v4, v3

    move v3, v5

    move v5, v7

    move/from16 v15, v16

    goto/16 :goto_20

    :cond_4a
    const/16 v8, 0x30

    if-ne v3, v8, :cond_4c

    .line 86
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v6

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    if-eq v3, v8, :cond_4b

    if-eq v3, v5, :cond_4b

    const/16 v21, 0x0

    return v21

    :cond_4b
    move v5, v4

    move v4, v3

    move v3, v5

    move v15, v14

    const/16 v5, 0x30

    goto :goto_20

    :cond_4c
    if-ne v3, v5, :cond_4d

    .line 87
    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v7, v11

    add-int/lit8 v7, v7, 0xa

    add-int/2addr v7, v6

    add-int/lit8 v7, v7, 0x4

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    const/16 v10, 0x30

    if-ne v7, v10, :cond_4e

    move v3, v4

    move v4, v5

    move v5, v10

    :goto_1f
    move v15, v14

    goto :goto_20

    :cond_4d
    const/16 v10, 0x30

    :cond_4e
    const/16 v5, 0x34

    if-ne v3, v5, :cond_4f

    .line 88
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v11

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v6

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    const/16 v5, 0x35

    if-ne v3, v5, :cond_4f

    const/16 v12, 0x34

    const/16 v3, 0x35

    move v5, v3

    move v3, v4

    move v4, v12

    goto :goto_1f

    :cond_4f
    move v3, v4

    move v4, v10

    move v5, v4

    move/from16 v15, v18

    .line 89
    :goto_20
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->setTimeZone(CCCCC)V

    .line 90
    :goto_21
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v11, v11, 0xa

    add-int/2addr v11, v6

    add-int/2addr v11, v15

    add-int/2addr v1, v11

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_50

    const/16 v2, 0x22

    if-eq v1, v2, :cond_50

    const/16 v21, 0x0

    return v21

    .line 91
    :cond_50
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v11

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 92
    iput v14, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v20

    :goto_22
    return v21

    :goto_23
    if-eqz p1, :cond_51

    return v21

    .line 93
    :cond_51
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v22, 0x8

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v23

    if-ne v2, v15, :cond_52

    if-ne v7, v15, :cond_52

    move/from16 v5, v20

    goto :goto_24

    :cond_52
    const/4 v5, 0x0

    :goto_24
    if-eqz v5, :cond_53

    const/16 v8, 0x10

    if-ne v9, v8, :cond_53

    move/from16 v28, v20

    goto :goto_25

    :cond_53
    const/16 v28, 0x0

    :goto_25
    if-eqz v5, :cond_54

    const/16 v5, 0x11

    if-ne v9, v5, :cond_54

    move/from16 v31, v20

    goto :goto_26

    :cond_54
    const/16 v31, 0x0

    :goto_26
    if-nez v31, :cond_57

    if-eqz v28, :cond_55

    goto :goto_29

    :cond_55
    if-ne v2, v15, :cond_56

    if-ne v6, v15, :cond_56

    move v2, v12

    move v12, v1

    move v1, v2

    move/from16 v17, v3

    move v15, v4

    move/from16 v16, v10

    move/from16 v18, v16

    :goto_27
    move/from16 v2, v19

    const/16 v24, 0x9

    :goto_28
    const/16 v25, 0x20

    move/from16 v19, v7

    goto :goto_2a

    :cond_56
    move v15, v12

    move v12, v1

    move v1, v15

    move/from16 v16, v2

    move/from16 v17, v3

    move v15, v4

    move/from16 v18, v6

    goto :goto_27

    .line 94
    :cond_57
    :goto_29
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v24, 0x9

    add-int/lit8 v2, v2, 0x9

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    move v2, v12

    move v12, v1

    move v1, v2

    move/from16 v16, v3

    move v15, v4

    move/from16 v17, v6

    move/from16 v2, v19

    move/from16 v18, v23

    goto :goto_28

    .line 95
    :goto_2a
    invoke-static/range {v12 .. v19}, Lcom/alibaba/fastjson/parser/JSONScanner;->checkDate(CCCCCCII)Z

    move-result v3

    move/from16 v5, v16

    move/from16 v6, v17

    move/from16 v7, v18

    move/from16 v8, v19

    if-nez v3, :cond_58

    const/16 v21, 0x0

    return v21

    :cond_58
    move v3, v14

    move v4, v15

    move/from16 v15, v27

    move v14, v1

    move v1, v12

    move v12, v2

    move v2, v13

    move/from16 v13, v25

    .line 96
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->setCalendar(CCCCCCCC)V

    const/16 v5, 0x8

    if-eq v9, v5, :cond_65

    .line 97
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0x9

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 98
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v2, v2, 0xa

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    .line 99
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v3, v12

    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v3

    .line 100
    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v4, v4, 0xc

    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v4

    .line 101
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v5, v5, 0xd

    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    if-eqz v31, :cond_59

    if-ne v2, v14, :cond_59

    const/16 v7, 0x3a

    if-ne v5, v7, :cond_59

    .line 102
    iget v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v30, 0x10

    add-int/lit8 v6, v6, 0x10

    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v6

    const/16 v7, 0x5a

    if-eq v6, v7, :cond_5b

    :cond_59
    if-eqz v28, :cond_5c

    if-eq v2, v13, :cond_5a

    if-ne v2, v14, :cond_5c

    :cond_5a
    const/16 v7, 0x3a

    if-ne v5, v7, :cond_5c

    .line 103
    :cond_5b
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v29, 0xe

    add-int/lit8 v1, v1, 0xe

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    .line 104
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0xf

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    move v5, v4

    move v4, v1

    move v1, v3

    move v3, v2

    move v2, v5

    move v5, v10

    move v6, v5

    goto :goto_2b

    :cond_5c
    move v6, v5

    move v5, v4

    move v4, v3

    move v3, v2

    move v2, v1

    move/from16 v1, v23

    .line 105
    :goto_2b
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->checkTime(CCCCCC)Z

    move-result v7

    move/from16 v40, v3

    move v3, v1

    move v1, v2

    move/from16 v2, v40

    if-nez v7, :cond_5d

    const/16 v21, 0x0

    return v21

    :cond_5d
    const/16 v7, 0x11

    if-ne v9, v7, :cond_64

    if-nez v31, :cond_64

    .line 106
    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v29, 0xe

    add-int/lit8 v7, v7, 0xe

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v7

    .line 107
    iget v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v8, v8, 0xf

    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v8

    .line 108
    iget v9, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/16 v30, 0x10

    add-int/lit8 v9, v9, 0x10

    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v9

    if-lt v7, v10, :cond_5e

    if-le v7, v11, :cond_5f

    :cond_5e
    const/16 v21, 0x0

    goto :goto_2c

    :cond_5f
    if-lt v8, v10, :cond_60

    if-le v8, v11, :cond_61

    :cond_60
    const/16 v21, 0x0

    goto :goto_2c

    :cond_61
    if-lt v9, v10, :cond_62

    if-le v9, v11, :cond_63

    :cond_62
    const/16 v21, 0x0

    goto :goto_2c

    :cond_63
    sub-int/2addr v7, v10

    mul-int/lit8 v7, v7, 0x64

    sub-int/2addr v8, v10

    mul-int/lit8 v8, v8, 0xa

    add-int/2addr v7, v8

    sub-int/2addr v9, v10

    add-int/2addr v7, v9

    move/from16 v21, v7

    goto :goto_2d

    :goto_2c
    return v21

    :cond_64
    const/16 v21, 0x0

    :goto_2d
    sub-int/2addr v3, v10

    mul-int/lit8 v3, v3, 0xa

    sub-int/2addr v1, v10

    add-int/2addr v1, v3

    add-int/lit8 v3, v2, -0x30

    mul-int/lit8 v3, v3, 0xa

    sub-int/2addr v4, v10

    add-int v2, v3, v4

    sub-int/2addr v5, v10

    mul-int/lit8 v5, v5, 0xa

    sub-int/2addr v6, v10

    add-int v10, v5, v6

    move v3, v10

    move v10, v1

    move v1, v3

    move/from16 v3, v21

    goto :goto_2e

    :cond_65
    const/16 v21, 0x0

    move/from16 v1, v21

    move v2, v1

    move v3, v2

    move v10, v3

    .line 109
    :goto_2e
    iget-object v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    invoke-virtual {v4, v12, v10}, Ljava/util/Calendar;->set(II)V

    .line 110
    iget-object v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v5, 0xc

    invoke-virtual {v4, v5, v2}, Ljava/util/Calendar;->set(II)V

    .line 111
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v4, 0xd

    invoke-virtual {v2, v4, v1}, Ljava/util/Calendar;->set(II)V

    .line 112
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xe

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 113
    iput v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v20
.end method

.method private setCalendar(CCCCCCCC)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->timeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->locale:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 10
    .line 11
    add-int/lit8 p1, p1, -0x30

    .line 12
    .line 13
    mul-int/lit16 p1, p1, 0x3e8

    .line 14
    .line 15
    add-int/lit8 p2, p2, -0x30

    .line 16
    .line 17
    mul-int/lit8 p2, p2, 0x64

    .line 18
    .line 19
    add-int/2addr p1, p2

    .line 20
    add-int/lit8 p3, p3, -0x30

    .line 21
    .line 22
    mul-int/lit8 p3, p3, 0xa

    .line 23
    .line 24
    add-int/2addr p1, p3

    .line 25
    add-int/lit8 p4, p4, -0x30

    .line 26
    .line 27
    add-int/2addr p1, p4

    .line 28
    add-int/lit8 p5, p5, -0x30

    .line 29
    .line 30
    mul-int/lit8 p5, p5, 0xa

    .line 31
    .line 32
    add-int/lit8 p6, p6, -0x30

    .line 33
    .line 34
    add-int/2addr p5, p6

    .line 35
    const/4 p2, 0x1

    .line 36
    sub-int/2addr p5, p2

    .line 37
    add-int/lit8 p7, p7, -0x30

    .line 38
    .line 39
    mul-int/lit8 p7, p7, 0xa

    .line 40
    .line 41
    add-int/lit8 p8, p8, -0x30

    .line 42
    .line 43
    add-int/2addr p7, p8

    .line 44
    invoke-virtual {v0, p2, p1}, Ljava/util/Calendar;->set(II)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 48
    .line 49
    const/4 p2, 0x2

    .line 50
    invoke-virtual {p1, p2, p5}, Ljava/util/Calendar;->set(II)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 54
    .line 55
    const/4 p2, 0x5

    .line 56
    invoke-virtual {p1, p2, p7}, Ljava/util/Calendar;->set(II)V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final addSymbol(IIILcom/alibaba/fastjson/parser/SymbolTable;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p4, v0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/SymbolTable;->addSymbol(Ljava/lang/String;III)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final arrayCopy(I[CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 2
    .line 3
    add-int/2addr p4, p1

    .line 4
    invoke-virtual {v0, p1, p4, p2, p3}, Ljava/lang/String;->getChars(II[CI)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public bytesValue()[B
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 13
    .line 14
    rem-int/lit8 v3, v1, 0x2

    .line 15
    .line 16
    if-nez v3, :cond_3

    .line 17
    .line 18
    div-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    new-array v3, v1, [B

    .line 21
    .line 22
    :goto_0
    if-ge v2, v1, :cond_2

    .line 23
    .line 24
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 25
    .line 26
    mul-int/lit8 v5, v2, 0x2

    .line 27
    .line 28
    add-int/2addr v5, v0

    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 34
    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/16 v6, 0x37

    .line 42
    .line 43
    const/16 v7, 0x30

    .line 44
    .line 45
    const/16 v8, 0x39

    .line 46
    .line 47
    if-gt v4, v8, :cond_0

    .line 48
    .line 49
    move v9, v7

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v9, v6

    .line 52
    :goto_1
    sub-int/2addr v4, v9

    .line 53
    if-gt v5, v8, :cond_1

    .line 54
    .line 55
    move v6, v7

    .line 56
    :cond_1
    sub-int/2addr v5, v6

    .line 57
    shl-int/lit8 v4, v4, 0x4

    .line 58
    .line 59
    or-int/2addr v4, v5

    .line 60
    int-to-byte v4, v4

    .line 61
    aput-byte v4, v3, v2

    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v3

    .line 67
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v3, "illegal state. "

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_4
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->hasSpecial:Z

    .line 91
    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 95
    .line 96
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson/util/IOUtils;->decodeBase64(Ljava/lang/String;II)[B

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 108
    .line 109
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 110
    .line 111
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 112
    .line 113
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Lcom/alibaba/fastjson/util/IOUtils;->decodeBase64(Ljava/lang/String;)[B

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0
.end method

.method public final charArrayCompare([C)Z
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    move-result p1

    return p1
.end method

.method public final charAt(I)C
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x1a

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final copyTo(II[C)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 2
    .line 3
    add-int/2addr p2, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, p1, p2, p3, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final decimalValue()Ljava/math/BigDecimal;
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 13
    .line 14
    const/16 v2, 0x4c

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const/16 v2, 0x53

    .line 19
    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    const/16 v2, 0x42

    .line 23
    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    const/16 v2, 0x46

    .line 27
    .line 28
    if-eq v0, v2, :cond_0

    .line 29
    .line 30
    const/16 v2, 0x44

    .line 31
    .line 32
    if-ne v0, v2, :cond_1

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    :cond_1
    const v0, 0xffff

    .line 37
    .line 38
    .line 39
    if-gt v1, v0, :cond_3

    .line 40
    .line 41
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 42
    .line 43
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 44
    .line 45
    array-length v3, v2

    .line 46
    const/4 v4, 0x0

    .line 47
    if-ge v1, v3, :cond_2

    .line 48
    .line 49
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 50
    .line 51
    add-int v5, v0, v1

    .line 52
    .line 53
    invoke-virtual {v3, v0, v5, v2, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ljava/math/BigDecimal;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 59
    .line 60
    sget-object v3, Ljava/math/MathContext;->UNLIMITED:Ljava/math/MathContext;

    .line 61
    .line 62
    invoke-direct {v0, v2, v4, v1, v3}, Ljava/math/BigDecimal;-><init>([CIILjava/math/MathContext;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    new-array v2, v1, [C

    .line 67
    .line 68
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 69
    .line 70
    add-int v5, v0, v1

    .line 71
    .line 72
    invoke-virtual {v3, v0, v5, v2, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Ljava/math/BigDecimal;

    .line 76
    .line 77
    sget-object v3, Ljava/math/MathContext;->UNLIMITED:Ljava/math/MathContext;

    .line 78
    .line 79
    invoke-direct {v0, v2, v4, v1, v3}, Ljava/math/BigDecimal;-><init>([CIILjava/math/MathContext;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    .line 84
    .line 85
    const-string v1, "decimal overflow"

    .line 86
    .line 87
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
.end method

.method public final indexOf(CI)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public info()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v4, v1

    .line 9
    move v5, v4

    .line 10
    move v3, v2

    .line 11
    :goto_0
    iget v6, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 12
    .line 13
    if-ge v3, v6, :cond_1

    .line 14
    .line 15
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/16 v7, 0xa

    .line 22
    .line 23
    if-ne v6, v7, :cond_0

    .line 24
    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    move v5, v1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    add-int/2addr v5, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string v1, "pos "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", line "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", column "

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const v3, 0xffff

    .line 65
    .line 66
    .line 67
    if-ge v1, v3, :cond_2

    .line 68
    .line 69
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0
.end method

.method public isEOF()Z
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 9
    .line 10
    const/16 v4, 0x1a

    .line 11
    .line 12
    if-ne v3, v4, :cond_0

    .line 13
    .line 14
    add-int/2addr v0, v2

    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    return v2
.end method

.method public matchField2([C)Z
    .locals 4

    .line 1
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare([C)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, -0x2

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 25
    .line 26
    array-length p1, p1

    .line 27
    add-int/2addr v0, p1

    .line 28
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 29
    .line 30
    add-int/lit8 v3, v0, 0x1

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    :goto_1
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 43
    .line 44
    add-int/lit8 v0, v3, 0x1

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    move v3, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/16 v0, 0x3a

    .line 53
    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 57
    .line 58
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    return p1

    .line 66
    :cond_3
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 67
    .line 68
    return v1
.end method

.method public final next()C
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 6
    .line 7
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x1a

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :goto_0
    iput-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 21
    .line 22
    return v0
.end method

.method public final numberString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 13
    .line 14
    const/16 v2, 0x4c

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const/16 v2, 0x53

    .line 19
    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    const/16 v2, 0x42

    .line 23
    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    const/16 v2, 0x46

    .line 27
    .line 28
    if-eq v0, v2, :cond_0

    .line 29
    .line 30
    const/16 v2, 0x44

    .line 31
    .line 32
    if-ne v0, v2, :cond_1

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public scanDate(C)Ljava/util/Date;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    .line 8
    iget-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 9
    .line 10
    add-int/lit8 v4, v2, 0x1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const/16 v6, 0x5d

    .line 17
    .line 18
    const/16 v7, 0x2c

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, -0x1

    .line 22
    const/4 v10, 0x1

    .line 23
    const/16 v11, 0x22

    .line 24
    .line 25
    if-ne v5, v11, :cond_5

    .line 26
    .line 27
    invoke-virtual {v0, v11, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->indexOf(CI)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eq v5, v9, :cond_4

    .line 32
    .line 33
    sub-int v11, v5, v4

    .line 34
    .line 35
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 36
    .line 37
    invoke-direct {v0, v1, v11}, Lcom/alibaba/fastjson/parser/JSONScanner;->scanISO8601DateIfMatch(ZI)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    add-int/lit8 v4, v5, 0x1

    .line 50
    .line 51
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 56
    .line 57
    :goto_0
    if-eq v4, v7, :cond_2

    .line 58
    .line 59
    if-ne v4, v6, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-static {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    add-int/lit8 v4, v5, 0x1

    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x2

    .line 71
    .line 72
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    move/from16 v19, v5

    .line 77
    .line 78
    move v5, v4

    .line 79
    move/from16 v4, v19

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 83
    .line 84
    iput-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 85
    .line 86
    iput v9, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 87
    .line 88
    return-object v8

    .line 89
    :cond_2
    :goto_1
    add-int/2addr v5, v10

    .line 90
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 91
    .line 92
    iput-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 93
    .line 94
    move-object/from16 v16, v8

    .line 95
    .line 96
    :goto_2
    move/from16 p1, v10

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_3
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 101
    .line 102
    iput-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 103
    .line 104
    iput v9, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 105
    .line 106
    return-object v8

    .line 107
    :cond_4
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    .line 108
    .line 109
    const-string v2, "unclosed str"

    .line 110
    .line 111
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v1

    .line 115
    :cond_5
    const/16 v11, 0x2d

    .line 116
    .line 117
    const/16 v12, 0x39

    .line 118
    .line 119
    const/16 v13, 0x30

    .line 120
    .line 121
    if-eq v5, v11, :cond_8

    .line 122
    .line 123
    if-lt v5, v13, :cond_6

    .line 124
    .line 125
    if-gt v5, v12, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    const/16 v1, 0x6e

    .line 129
    .line 130
    if-ne v5, v1, :cond_7

    .line 131
    .line 132
    add-int/lit8 v1, v2, 0x2

    .line 133
    .line 134
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    const/16 v5, 0x75

    .line 139
    .line 140
    if-ne v4, v5, :cond_7

    .line 141
    .line 142
    add-int/lit8 v4, v2, 0x3

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    const/16 v5, 0x6c

    .line 149
    .line 150
    if-ne v1, v5, :cond_7

    .line 151
    .line 152
    add-int/lit8 v1, v2, 0x4

    .line 153
    .line 154
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-ne v4, v5, :cond_7

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 165
    .line 166
    move-object v1, v8

    .line 167
    move-object/from16 v16, v1

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_7
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 171
    .line 172
    iput-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 173
    .line 174
    iput v9, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 175
    .line 176
    return-object v8

    .line 177
    :cond_8
    :goto_3
    if-ne v5, v11, :cond_9

    .line 178
    .line 179
    add-int/lit8 v1, v2, 0x2

    .line 180
    .line 181
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    move v4, v1

    .line 186
    move v1, v10

    .line 187
    :cond_9
    const-wide/16 v14, 0x0

    .line 188
    .line 189
    if-lt v5, v13, :cond_d

    .line 190
    .line 191
    if-gt v5, v12, :cond_d

    .line 192
    .line 193
    add-int/lit8 v5, v5, -0x30

    .line 194
    .line 195
    move/from16 p1, v10

    .line 196
    .line 197
    int-to-long v10, v5

    .line 198
    :goto_4
    add-int/lit8 v5, v4, 0x1

    .line 199
    .line 200
    move-object/from16 v16, v8

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-lt v8, v13, :cond_a

    .line 207
    .line 208
    if-gt v8, v12, :cond_a

    .line 209
    .line 210
    const-wide/16 v17, 0xa

    .line 211
    .line 212
    mul-long v10, v10, v17

    .line 213
    .line 214
    add-int/lit8 v8, v8, -0x30

    .line 215
    .line 216
    int-to-long v12, v8

    .line 217
    add-long/2addr v10, v12

    .line 218
    move v4, v5

    .line 219
    move-object/from16 v8, v16

    .line 220
    .line 221
    const/16 v12, 0x39

    .line 222
    .line 223
    const/16 v13, 0x30

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    if-eq v8, v7, :cond_b

    .line 227
    .line 228
    if-ne v8, v6, :cond_c

    .line 229
    .line 230
    :cond_b
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 231
    .line 232
    :cond_c
    move v4, v8

    .line 233
    goto :goto_5

    .line 234
    :cond_d
    move-object/from16 v16, v8

    .line 235
    .line 236
    move/from16 p1, v10

    .line 237
    .line 238
    move v4, v5

    .line 239
    move-wide v10, v14

    .line 240
    :goto_5
    cmp-long v5, v10, v14

    .line 241
    .line 242
    if-gez v5, :cond_e

    .line 243
    .line 244
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 245
    .line 246
    iput-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 247
    .line 248
    iput v9, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 249
    .line 250
    return-object v16

    .line 251
    :cond_e
    if-eqz v1, :cond_f

    .line 252
    .line 253
    neg-long v10, v10

    .line 254
    :cond_f
    new-instance v1, Ljava/util/Date;

    .line 255
    .line 256
    invoke-direct {v1, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 257
    .line 258
    .line 259
    :goto_6
    if-ne v4, v7, :cond_10

    .line 260
    .line 261
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 262
    .line 263
    add-int/lit8 v2, v2, 0x1

    .line 264
    .line 265
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 266
    .line 267
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 272
    .line 273
    const/4 v2, 0x3

    .line 274
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 275
    .line 276
    return-object v1

    .line 277
    :cond_10
    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 278
    .line 279
    add-int/lit8 v4, v4, 0x1

    .line 280
    .line 281
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 282
    .line 283
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    if-ne v4, v7, :cond_11

    .line 288
    .line 289
    const/16 v2, 0x10

    .line 290
    .line 291
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 292
    .line 293
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 294
    .line 295
    add-int/lit8 v2, v2, 0x1

    .line 296
    .line 297
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 298
    .line 299
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_11
    if-ne v4, v6, :cond_12

    .line 307
    .line 308
    const/16 v2, 0xf

    .line 309
    .line 310
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 311
    .line 312
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 313
    .line 314
    add-int/lit8 v2, v2, 0x1

    .line 315
    .line 316
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 317
    .line 318
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_12
    const/16 v5, 0x7d

    .line 326
    .line 327
    if-ne v4, v5, :cond_13

    .line 328
    .line 329
    const/16 v2, 0xd

    .line 330
    .line 331
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 332
    .line 333
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 334
    .line 335
    add-int/lit8 v2, v2, 0x1

    .line 336
    .line 337
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 338
    .line 339
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_13
    const/16 v5, 0x1a

    .line 347
    .line 348
    if-ne v4, v5, :cond_14

    .line 349
    .line 350
    iput-char v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 351
    .line 352
    const/16 v2, 0x14

    .line 353
    .line 354
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 355
    .line 356
    :goto_7
    const/4 v2, 0x4

    .line 357
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 358
    .line 359
    return-object v1

    .line 360
    :cond_14
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 361
    .line 362
    iput-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 363
    .line 364
    iput v9, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 365
    .line 366
    return-object v16
.end method

.method public scanDouble(C)D
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/16 v6, 0x22

    .line 15
    .line 16
    if-ne v4, v6, :cond_0

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v7, v1

    .line 21
    :goto_0
    if-eqz v7, :cond_1

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x2

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    move v3, v2

    .line 30
    :cond_1
    const/16 v2, 0x2d

    .line 31
    .line 32
    if-ne v4, v2, :cond_2

    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v8, v1

    .line 37
    :goto_1
    if-eqz v8, :cond_3

    .line 38
    .line 39
    add-int/lit8 v4, v3, 0x1

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    move/from16 v22, v4

    .line 46
    .line 47
    move v4, v3

    .line 48
    move/from16 v3, v22

    .line 49
    .line 50
    :cond_3
    const/4 v12, -0x1

    .line 51
    const/16 v13, 0x30

    .line 52
    .line 53
    if-lt v4, v13, :cond_13

    .line 54
    .line 55
    const/16 v14, 0x39

    .line 56
    .line 57
    if-gt v4, v14, :cond_13

    .line 58
    .line 59
    sub-int/2addr v4, v13

    .line 60
    const-wide/16 v15, 0x0

    .line 61
    .line 62
    int-to-long v10, v4

    .line 63
    :goto_2
    add-int/lit8 v4, v3, 0x1

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const-wide/16 v18, 0xa

    .line 70
    .line 71
    if-lt v1, v13, :cond_4

    .line 72
    .line 73
    if-gt v1, v14, :cond_4

    .line 74
    .line 75
    mul-long v10, v10, v18

    .line 76
    .line 77
    add-int/lit8 v1, v1, -0x30

    .line 78
    .line 79
    move-wide/from16 v18, v10

    .line 80
    .line 81
    int-to-long v9, v1

    .line 82
    add-long v10, v18, v9

    .line 83
    .line 84
    move v3, v4

    .line 85
    const/4 v1, 0x0

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    const/16 v9, 0x2e

    .line 88
    .line 89
    if-ne v1, v9, :cond_7

    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x2

    .line 92
    .line 93
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-lt v1, v13, :cond_6

    .line 98
    .line 99
    if-gt v1, v14, :cond_6

    .line 100
    .line 101
    mul-long v10, v10, v18

    .line 102
    .line 103
    sub-int/2addr v1, v13

    .line 104
    const/4 v9, 0x1

    .line 105
    int-to-long v5, v1

    .line 106
    add-long/2addr v10, v5

    .line 107
    move-wide/from16 v4, v18

    .line 108
    .line 109
    :goto_3
    add-int/lit8 v1, v3, 0x1

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-lt v3, v13, :cond_5

    .line 116
    .line 117
    if-gt v3, v14, :cond_5

    .line 118
    .line 119
    mul-long v10, v10, v18

    .line 120
    .line 121
    add-int/lit8 v3, v3, -0x30

    .line 122
    .line 123
    move v6, v9

    .line 124
    move-wide/from16 v20, v10

    .line 125
    .line 126
    int-to-long v9, v3

    .line 127
    add-long v10, v20, v9

    .line 128
    .line 129
    mul-long v4, v4, v18

    .line 130
    .line 131
    move v3, v1

    .line 132
    move v9, v6

    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move v6, v9

    .line 135
    move-wide/from16 v22, v4

    .line 136
    .line 137
    move v4, v1

    .line 138
    move v1, v3

    .line 139
    move v3, v6

    .line 140
    move v5, v7

    .line 141
    move-wide v6, v10

    .line 142
    move-wide/from16 v9, v22

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 146
    .line 147
    return-wide v15

    .line 148
    :cond_7
    const/4 v6, 0x1

    .line 149
    const-wide/16 v18, 0x1

    .line 150
    .line 151
    move v3, v6

    .line 152
    move v5, v7

    .line 153
    move-wide v6, v10

    .line 154
    move-wide/from16 v9, v18

    .line 155
    .line 156
    :goto_4
    const/16 v11, 0x65

    .line 157
    .line 158
    if-eq v1, v11, :cond_9

    .line 159
    .line 160
    const/16 v11, 0x45

    .line 161
    .line 162
    if-ne v1, v11, :cond_8

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    const/16 v17, 0x0

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_9
    :goto_5
    move/from16 v17, v3

    .line 169
    .line 170
    :goto_6
    if-eqz v17, :cond_c

    .line 171
    .line 172
    add-int/lit8 v1, v4, 0x1

    .line 173
    .line 174
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    move/from16 v18, v3

    .line 179
    .line 180
    const/16 v3, 0x2b

    .line 181
    .line 182
    if-eq v11, v3, :cond_b

    .line 183
    .line 184
    if-ne v11, v2, :cond_a

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_a
    move v4, v1

    .line 188
    move v1, v11

    .line 189
    goto :goto_8

    .line 190
    :cond_b
    :goto_7
    add-int/lit8 v4, v4, 0x2

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    :goto_8
    if-lt v1, v13, :cond_d

    .line 197
    .line 198
    if-gt v1, v14, :cond_d

    .line 199
    .line 200
    add-int/lit8 v1, v4, 0x1

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    move v4, v1

    .line 207
    move v1, v2

    .line 208
    goto :goto_8

    .line 209
    :cond_c
    move/from16 v18, v3

    .line 210
    .line 211
    :cond_d
    if-eqz v5, :cond_f

    .line 212
    .line 213
    const/16 v2, 0x22

    .line 214
    .line 215
    if-eq v1, v2, :cond_e

    .line 216
    .line 217
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 218
    .line 219
    return-wide v15

    .line 220
    :cond_e
    add-int/lit8 v1, v4, 0x1

    .line 221
    .line 222
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 227
    .line 228
    add-int/lit8 v3, v3, 0x1

    .line 229
    .line 230
    sub-int v4, v1, v3

    .line 231
    .line 232
    add-int/lit8 v4, v4, -0x2

    .line 233
    .line 234
    move/from16 v22, v2

    .line 235
    .line 236
    move v2, v1

    .line 237
    move/from16 v1, v22

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_f
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 241
    .line 242
    sub-int v2, v4, v3

    .line 243
    .line 244
    add-int/lit8 v2, v2, -0x1

    .line 245
    .line 246
    move/from16 v22, v4

    .line 247
    .line 248
    move v4, v2

    .line 249
    move/from16 v2, v22

    .line 250
    .line 251
    :goto_9
    if-nez v17, :cond_11

    .line 252
    .line 253
    const/16 v5, 0x12

    .line 254
    .line 255
    if-ge v4, v5, :cond_11

    .line 256
    .line 257
    long-to-double v3, v6

    .line 258
    long-to-double v5, v9

    .line 259
    div-double/2addr v3, v5

    .line 260
    if-eqz v8, :cond_10

    .line 261
    .line 262
    neg-double v3, v3

    .line 263
    :cond_10
    :goto_a
    move/from16 v5, p1

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_11
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 271
    .line 272
    .line 273
    move-result-wide v3

    .line 274
    goto :goto_a

    .line 275
    :goto_b
    if-ne v1, v5, :cond_12

    .line 276
    .line 277
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 278
    .line 279
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 284
    .line 285
    const/4 v1, 0x3

    .line 286
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 287
    .line 288
    const/16 v1, 0x10

    .line 289
    .line 290
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 291
    .line 292
    return-wide v3

    .line 293
    :cond_12
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 294
    .line 295
    return-wide v3

    .line 296
    :cond_13
    move v5, v7

    .line 297
    const-wide/16 v15, 0x0

    .line 298
    .line 299
    const/16 v1, 0x6e

    .line 300
    .line 301
    if-ne v4, v1, :cond_18

    .line 302
    .line 303
    add-int/lit8 v1, v3, 0x1

    .line 304
    .line 305
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    const/16 v4, 0x75

    .line 310
    .line 311
    if-ne v2, v4, :cond_18

    .line 312
    .line 313
    add-int/lit8 v2, v3, 0x2

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    const/16 v4, 0x6c

    .line 320
    .line 321
    if-ne v1, v4, :cond_18

    .line 322
    .line 323
    add-int/lit8 v1, v3, 0x3

    .line 324
    .line 325
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-ne v2, v4, :cond_18

    .line 330
    .line 331
    const/4 v2, 0x5

    .line 332
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 333
    .line 334
    add-int/lit8 v4, v3, 0x4

    .line 335
    .line 336
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v5, :cond_14

    .line 341
    .line 342
    const/16 v5, 0x22

    .line 343
    .line 344
    if-ne v1, v5, :cond_14

    .line 345
    .line 346
    add-int/2addr v3, v2

    .line 347
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    move v4, v3

    .line 352
    :cond_14
    :goto_c
    const/16 v3, 0x2c

    .line 353
    .line 354
    if-ne v1, v3, :cond_15

    .line 355
    .line 356
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 357
    .line 358
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 363
    .line 364
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 365
    .line 366
    const/16 v3, 0x10

    .line 367
    .line 368
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 369
    .line 370
    return-wide v15

    .line 371
    :cond_15
    const/16 v3, 0x10

    .line 372
    .line 373
    const/16 v5, 0x5d

    .line 374
    .line 375
    if-ne v1, v5, :cond_16

    .line 376
    .line 377
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 378
    .line 379
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 384
    .line 385
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 386
    .line 387
    const/16 v1, 0xf

    .line 388
    .line 389
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 390
    .line 391
    return-wide v15

    .line 392
    :cond_16
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-eqz v1, :cond_17

    .line 397
    .line 398
    add-int/lit8 v1, v4, 0x1

    .line 399
    .line 400
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    move/from16 v22, v4

    .line 405
    .line 406
    move v4, v1

    .line 407
    move/from16 v1, v22

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_17
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 411
    .line 412
    return-wide v15

    .line 413
    :cond_18
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 414
    .line 415
    return-wide v15
.end method

.method public scanFieldBoolean([C)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 5
    .line 6
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    .line 8
    invoke-static {v1, v2, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 p1, -0x2

    .line 15
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 19
    .line 20
    array-length p1, p1

    .line 21
    add-int/2addr p1, v1

    .line 22
    add-int/lit8 v2, p1, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/16 v4, 0x22

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-ne v3, v4, :cond_1

    .line 32
    .line 33
    move v6, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v6, v0

    .line 36
    :goto_0
    if-eqz v6, :cond_2

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x2

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    move v2, p1

    .line 45
    :cond_2
    const/16 p1, 0x74

    .line 46
    .line 47
    const/16 v7, 0x65

    .line 48
    .line 49
    const/4 v8, 0x4

    .line 50
    const/4 v9, -0x1

    .line 51
    if-ne v3, p1, :cond_8

    .line 52
    .line 53
    add-int/lit8 p1, v2, 0x1

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/16 v10, 0x72

    .line 60
    .line 61
    if-eq v3, v10, :cond_3

    .line 62
    .line 63
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 64
    .line 65
    return v0

    .line 66
    :cond_3
    add-int/lit8 v3, v2, 0x2

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const/16 v10, 0x75

    .line 73
    .line 74
    if-eq p1, v10, :cond_4

    .line 75
    .line 76
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 77
    .line 78
    return v0

    .line 79
    :cond_4
    add-int/lit8 p1, v2, 0x3

    .line 80
    .line 81
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eq v3, v7, :cond_5

    .line 86
    .line 87
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 88
    .line 89
    return v0

    .line 90
    :cond_5
    if-eqz v6, :cond_7

    .line 91
    .line 92
    add-int/2addr v2, v8

    .line 93
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eq p1, v4, :cond_6

    .line 98
    .line 99
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 100
    .line 101
    return v0

    .line 102
    :cond_6
    move p1, v2

    .line 103
    :cond_7
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    :goto_1
    move v2, v5

    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :cond_8
    const/16 p1, 0x66

    .line 113
    .line 114
    if-ne v3, p1, :cond_f

    .line 115
    .line 116
    add-int/lit8 p1, v2, 0x1

    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/16 v10, 0x61

    .line 123
    .line 124
    if-eq v3, v10, :cond_9

    .line 125
    .line 126
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 127
    .line 128
    return v0

    .line 129
    :cond_9
    add-int/lit8 v3, v2, 0x2

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    const/16 v10, 0x6c

    .line 136
    .line 137
    if-eq p1, v10, :cond_a

    .line 138
    .line 139
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 140
    .line 141
    return v0

    .line 142
    :cond_a
    add-int/lit8 p1, v2, 0x3

    .line 143
    .line 144
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    const/16 v10, 0x73

    .line 149
    .line 150
    if-eq v3, v10, :cond_b

    .line 151
    .line 152
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 153
    .line 154
    return v0

    .line 155
    :cond_b
    add-int/lit8 v3, v2, 0x4

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eq p1, v7, :cond_c

    .line 162
    .line 163
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 164
    .line 165
    return v0

    .line 166
    :cond_c
    if-eqz v6, :cond_e

    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x5

    .line 169
    .line 170
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eq p1, v4, :cond_d

    .line 175
    .line 176
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 177
    .line 178
    return v0

    .line 179
    :cond_d
    move v3, v2

    .line 180
    :cond_e
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 181
    .line 182
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    :goto_2
    move v2, v0

    .line 187
    goto :goto_3

    .line 188
    :cond_f
    const/16 p1, 0x31

    .line 189
    .line 190
    if-ne v3, p1, :cond_12

    .line 191
    .line 192
    if-eqz v6, :cond_11

    .line 193
    .line 194
    add-int/lit8 p1, v2, 0x1

    .line 195
    .line 196
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eq v2, v4, :cond_10

    .line 201
    .line 202
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 203
    .line 204
    return v0

    .line 205
    :cond_10
    move v2, p1

    .line 206
    :cond_11
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 207
    .line 208
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    goto :goto_1

    .line 213
    :cond_12
    const/16 p1, 0x30

    .line 214
    .line 215
    if-ne v3, p1, :cond_1d

    .line 216
    .line 217
    if-eqz v6, :cond_14

    .line 218
    .line 219
    add-int/lit8 p1, v2, 0x1

    .line 220
    .line 221
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eq v2, v4, :cond_13

    .line 226
    .line 227
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 228
    .line 229
    return v0

    .line 230
    :cond_13
    move v2, p1

    .line 231
    :cond_14
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 232
    .line 233
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    goto :goto_2

    .line 238
    :goto_3
    const/16 v3, 0x10

    .line 239
    .line 240
    const/16 v4, 0x2c

    .line 241
    .line 242
    if-ne p1, v4, :cond_15

    .line 243
    .line 244
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 245
    .line 246
    add-int/2addr p1, v5

    .line 247
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 248
    .line 249
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 254
    .line 255
    const/4 p1, 0x3

    .line 256
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 257
    .line 258
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 259
    .line 260
    return v2

    .line 261
    :cond_15
    const/16 v6, 0x7d

    .line 262
    .line 263
    if-ne p1, v6, :cond_1b

    .line 264
    .line 265
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 266
    .line 267
    add-int/2addr p1, v5

    .line 268
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 269
    .line 270
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    :goto_4
    if-ne p1, v4, :cond_16

    .line 275
    .line 276
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 277
    .line 278
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 279
    .line 280
    add-int/2addr p1, v5

    .line 281
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 282
    .line 283
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_16
    const/16 v1, 0x5d

    .line 291
    .line 292
    if-ne p1, v1, :cond_17

    .line 293
    .line 294
    const/16 p1, 0xf

    .line 295
    .line 296
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 297
    .line 298
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 299
    .line 300
    add-int/2addr p1, v5

    .line 301
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 302
    .line 303
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_17
    if-ne p1, v6, :cond_18

    .line 311
    .line 312
    const/16 p1, 0xd

    .line 313
    .line 314
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 315
    .line 316
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 317
    .line 318
    add-int/2addr p1, v5

    .line 319
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 320
    .line 321
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_18
    const/16 v1, 0x1a

    .line 329
    .line 330
    if-ne p1, v1, :cond_19

    .line 331
    .line 332
    const/16 p1, 0x14

    .line 333
    .line 334
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 335
    .line 336
    :goto_5
    iput v8, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 337
    .line 338
    return v2

    .line 339
    :cond_19
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_1a

    .line 344
    .line 345
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 346
    .line 347
    add-int/2addr p1, v5

    .line 348
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 349
    .line 350
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    goto :goto_4

    .line 355
    :cond_1a
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 356
    .line 357
    return v0

    .line 358
    :cond_1b
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-eqz p1, :cond_1c

    .line 363
    .line 364
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 365
    .line 366
    add-int/2addr p1, v5

    .line 367
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 368
    .line 369
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    goto/16 :goto_3

    .line 374
    .line 375
    :cond_1c
    iput v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 376
    .line 377
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 378
    .line 379
    .line 380
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 381
    .line 382
    return v0

    .line 383
    :cond_1d
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 384
    .line 385
    return v0
.end method

.method public scanFieldDate([C)Ljava/util/Date;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 7
    .line 8
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 9
    .line 10
    iget-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 11
    .line 12
    iget-object v5, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v5, v3, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/4 v6, 0x0

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    const/4 v1, -0x2

    .line 22
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 23
    .line 24
    return-object v6

    .line 25
    :cond_0
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 26
    .line 27
    array-length v1, v1

    .line 28
    add-int/2addr v5, v1

    .line 29
    add-int/lit8 v1, v5, 0x1

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/16 v8, 0x22

    .line 36
    .line 37
    const/16 v9, 0x7d

    .line 38
    .line 39
    const/16 v10, 0x2c

    .line 40
    .line 41
    const/4 v11, -0x1

    .line 42
    const/4 v12, 0x1

    .line 43
    if-ne v7, v8, :cond_6

    .line 44
    .line 45
    invoke-virtual {v0, v8, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->indexOf(CI)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eq v5, v11, :cond_5

    .line 50
    .line 51
    sub-int v7, v5, v1

    .line 52
    .line 53
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 54
    .line 55
    invoke-direct {v0, v2, v7}, Lcom/alibaba/fastjson/parser/JSONScanner;->scanISO8601DateIfMatch(ZI)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    add-int/lit8 v2, v5, 0x1

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 74
    .line 75
    :goto_0
    if-eq v2, v10, :cond_3

    .line 76
    .line 77
    if-ne v2, v9, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-static {v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    add-int/lit8 v2, v5, 0x1

    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x2

    .line 89
    .line 90
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    move/from16 v20, v5

    .line 95
    .line 96
    move v5, v2

    .line 97
    move/from16 v2, v20

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    iput v11, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 101
    .line 102
    return-object v6

    .line 103
    :cond_3
    :goto_1
    add-int/2addr v5, v12

    .line 104
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 105
    .line 106
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 107
    .line 108
    move-object/from16 v17, v6

    .line 109
    .line 110
    move/from16 p1, v12

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_4
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 115
    .line 116
    iput v11, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 117
    .line 118
    return-object v6

    .line 119
    :cond_5
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    .line 120
    .line 121
    const-string v2, "unclosed str"

    .line 122
    .line 123
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v1

    .line 127
    :cond_6
    const/16 v8, 0x2d

    .line 128
    .line 129
    const/16 v13, 0x39

    .line 130
    .line 131
    const/16 v14, 0x30

    .line 132
    .line 133
    if-eq v7, v8, :cond_8

    .line 134
    .line 135
    if-lt v7, v14, :cond_7

    .line 136
    .line 137
    if-gt v7, v13, :cond_7

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    iput v11, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 141
    .line 142
    return-object v6

    .line 143
    :cond_8
    :goto_2
    if-ne v7, v8, :cond_9

    .line 144
    .line 145
    add-int/lit8 v5, v5, 0x2

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    move v1, v5

    .line 152
    move v2, v12

    .line 153
    :cond_9
    const-wide/16 v15, 0x0

    .line 154
    .line 155
    if-lt v7, v14, :cond_c

    .line 156
    .line 157
    if-gt v7, v13, :cond_c

    .line 158
    .line 159
    add-int/lit8 v7, v7, -0x30

    .line 160
    .line 161
    int-to-long v7, v7

    .line 162
    :goto_3
    add-int/lit8 v5, v1, 0x1

    .line 163
    .line 164
    move-object/from16 v17, v6

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-lt v6, v14, :cond_a

    .line 171
    .line 172
    if-gt v6, v13, :cond_a

    .line 173
    .line 174
    const-wide/16 v18, 0xa

    .line 175
    .line 176
    mul-long v7, v7, v18

    .line 177
    .line 178
    add-int/lit8 v6, v6, -0x30

    .line 179
    .line 180
    move/from16 p1, v12

    .line 181
    .line 182
    int-to-long v12, v6

    .line 183
    add-long/2addr v7, v12

    .line 184
    move/from16 v12, p1

    .line 185
    .line 186
    move v1, v5

    .line 187
    move-object/from16 v6, v17

    .line 188
    .line 189
    const/16 v13, 0x39

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_a
    move/from16 p1, v12

    .line 193
    .line 194
    if-eq v6, v10, :cond_b

    .line 195
    .line 196
    if-ne v6, v9, :cond_d

    .line 197
    .line 198
    :cond_b
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_c
    move-object/from16 v17, v6

    .line 202
    .line 203
    move/from16 p1, v12

    .line 204
    .line 205
    move v6, v7

    .line 206
    move-wide v7, v15

    .line 207
    :cond_d
    :goto_4
    cmp-long v1, v7, v15

    .line 208
    .line 209
    if-gez v1, :cond_e

    .line 210
    .line 211
    iput v11, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 212
    .line 213
    return-object v17

    .line 214
    :cond_e
    if-eqz v2, :cond_f

    .line 215
    .line 216
    neg-long v7, v7

    .line 217
    :cond_f
    new-instance v1, Ljava/util/Date;

    .line 218
    .line 219
    invoke-direct {v1, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 220
    .line 221
    .line 222
    move v2, v6

    .line 223
    :goto_5
    const/16 v5, 0x10

    .line 224
    .line 225
    if-ne v2, v10, :cond_10

    .line 226
    .line 227
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 228
    .line 229
    add-int/lit8 v2, v2, 0x1

    .line 230
    .line 231
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 232
    .line 233
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 238
    .line 239
    const/4 v2, 0x3

    .line 240
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 241
    .line 242
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 243
    .line 244
    return-object v1

    .line 245
    :cond_10
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 246
    .line 247
    add-int/lit8 v2, v2, 0x1

    .line 248
    .line 249
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 250
    .line 251
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-ne v2, v10, :cond_11

    .line 256
    .line 257
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 258
    .line 259
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 260
    .line 261
    add-int/lit8 v2, v2, 0x1

    .line 262
    .line 263
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_11
    const/16 v5, 0x5d

    .line 273
    .line 274
    if-ne v2, v5, :cond_12

    .line 275
    .line 276
    const/16 v2, 0xf

    .line 277
    .line 278
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 279
    .line 280
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 281
    .line 282
    add-int/lit8 v2, v2, 0x1

    .line 283
    .line 284
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 285
    .line 286
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_12
    if-ne v2, v9, :cond_13

    .line 294
    .line 295
    const/16 v2, 0xd

    .line 296
    .line 297
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 298
    .line 299
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 300
    .line 301
    add-int/lit8 v2, v2, 0x1

    .line 302
    .line 303
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 304
    .line 305
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_13
    const/16 v5, 0x1a

    .line 313
    .line 314
    if-ne v2, v5, :cond_14

    .line 315
    .line 316
    const/16 v2, 0x14

    .line 317
    .line 318
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 319
    .line 320
    :goto_6
    const/4 v2, 0x4

    .line 321
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 322
    .line 323
    return-object v1

    .line 324
    :cond_14
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 325
    .line 326
    iput-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 327
    .line 328
    iput v11, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 329
    .line 330
    return-object v17
.end method

.method public scanFieldInt([C)I
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 3
    .line 4
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 5
    .line 6
    iget-char v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 7
    .line 8
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v3, v1, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    const/4 p1, -0x2

    .line 17
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 21
    .line 22
    array-length p1, p1

    .line 23
    add-int/2addr v3, p1

    .line 24
    add-int/lit8 p1, v3, 0x1

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/16 v5, 0x22

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    if-ne v4, v5, :cond_1

    .line 34
    .line 35
    move v7, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v7, v0

    .line 38
    :goto_0
    if-eqz v7, :cond_2

    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x2

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    move p1, v3

    .line 47
    :cond_2
    const/16 v3, 0x2d

    .line 48
    .line 49
    if-ne v4, v3, :cond_3

    .line 50
    .line 51
    move v3, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v3, v0

    .line 54
    :goto_1
    if-eqz v3, :cond_4

    .line 55
    .line 56
    add-int/lit8 v4, p1, 0x1

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    move v13, v4

    .line 63
    move v4, p1

    .line 64
    move p1, v13

    .line 65
    :cond_4
    const/16 v8, 0x30

    .line 66
    .line 67
    const/4 v9, -0x1

    .line 68
    if-lt v4, v8, :cond_16

    .line 69
    .line 70
    const/16 v10, 0x39

    .line 71
    .line 72
    if-gt v4, v10, :cond_16

    .line 73
    .line 74
    sub-int/2addr v4, v8

    .line 75
    :goto_2
    add-int/lit8 v11, p1, 0x1

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-lt v12, v8, :cond_6

    .line 82
    .line 83
    if-gt v12, v10, :cond_6

    .line 84
    .line 85
    mul-int/lit8 p1, v4, 0xa

    .line 86
    .line 87
    if-ge p1, v4, :cond_5

    .line 88
    .line 89
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 90
    .line 91
    return v0

    .line 92
    :cond_5
    add-int/lit8 v12, v12, -0x30

    .line 93
    .line 94
    add-int v4, p1, v12

    .line 95
    .line 96
    move p1, v11

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    const/16 v8, 0x2e

    .line 99
    .line 100
    if-ne v12, v8, :cond_7

    .line 101
    .line 102
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 103
    .line 104
    return v0

    .line 105
    :cond_7
    if-gez v4, :cond_8

    .line 106
    .line 107
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 108
    .line 109
    return v0

    .line 110
    :cond_8
    if-eqz v7, :cond_a

    .line 111
    .line 112
    if-eq v12, v5, :cond_9

    .line 113
    .line 114
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 115
    .line 116
    return v0

    .line 117
    :cond_9
    add-int/lit8 p1, p1, 0x2

    .line 118
    .line 119
    invoke-virtual {p0, v11}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    :goto_3
    move v11, p1

    .line 124
    :cond_a
    const/16 p1, 0x7d

    .line 125
    .line 126
    const/16 v5, 0x2c

    .line 127
    .line 128
    if-eq v12, v5, :cond_d

    .line 129
    .line 130
    if-ne v12, p1, :cond_b

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_b
    invoke-static {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_c

    .line 138
    .line 139
    add-int/lit8 p1, v11, 0x1

    .line 140
    .line 141
    invoke-virtual {p0, v11}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    goto :goto_3

    .line 146
    :cond_c
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 147
    .line 148
    return v0

    .line 149
    :cond_d
    :goto_4
    add-int/lit8 v7, v11, -0x1

    .line 150
    .line 151
    iput v7, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 152
    .line 153
    const/16 v7, 0x10

    .line 154
    .line 155
    if-ne v12, v5, :cond_e

    .line 156
    .line 157
    iput v11, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 158
    .line 159
    invoke-virtual {p0, v11}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 164
    .line 165
    const/4 p1, 0x3

    .line 166
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 167
    .line 168
    iput v7, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 169
    .line 170
    if-eqz v3, :cond_15

    .line 171
    .line 172
    neg-int p1, v4

    .line 173
    return p1

    .line 174
    :cond_e
    if-ne v12, p1, :cond_14

    .line 175
    .line 176
    iput v11, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 177
    .line 178
    invoke-virtual {p0, v11}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    :goto_5
    if-ne v8, v5, :cond_f

    .line 183
    .line 184
    iput v7, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 185
    .line 186
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 187
    .line 188
    add-int/2addr p1, v6

    .line 189
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_f
    const/16 v10, 0x5d

    .line 199
    .line 200
    if-ne v8, v10, :cond_10

    .line 201
    .line 202
    const/16 p1, 0xf

    .line 203
    .line 204
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 205
    .line 206
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 207
    .line 208
    add-int/2addr p1, v6

    .line 209
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 210
    .line 211
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_10
    if-ne v8, p1, :cond_11

    .line 219
    .line 220
    const/16 p1, 0xd

    .line 221
    .line 222
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 223
    .line 224
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 225
    .line 226
    add-int/2addr p1, v6

    .line 227
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 228
    .line 229
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_11
    const/16 v10, 0x1a

    .line 237
    .line 238
    if-ne v8, v10, :cond_12

    .line 239
    .line 240
    const/16 p1, 0x14

    .line 241
    .line 242
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 243
    .line 244
    :goto_6
    const/4 p1, 0x4

    .line 245
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_12
    invoke-static {v8}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_13

    .line 253
    .line 254
    iget v8, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 255
    .line 256
    add-int/2addr v8, v6

    .line 257
    iput v8, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 258
    .line 259
    invoke-virtual {p0, v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    goto :goto_5

    .line 264
    :cond_13
    iput v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 265
    .line 266
    iput-char v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 267
    .line 268
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 269
    .line 270
    return v0

    .line 271
    :cond_14
    :goto_7
    if-eqz v3, :cond_15

    .line 272
    .line 273
    neg-int p1, v4

    .line 274
    return p1

    .line 275
    :cond_15
    return v4

    .line 276
    :cond_16
    iput v9, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 277
    .line 278
    return v0
.end method

.method public scanFieldLong([C)J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 7
    .line 8
    iget v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 9
    .line 10
    iget-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 11
    .line 12
    iget-object v5, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v5, v3, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    const/4 v1, -0x2

    .line 23
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 24
    .line 25
    return-wide v6

    .line 26
    :cond_0
    iget v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 27
    .line 28
    array-length v1, v1

    .line 29
    add-int/2addr v5, v1

    .line 30
    add-int/lit8 v1, v5, 0x1

    .line 31
    .line 32
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    const/16 v9, 0x22

    .line 37
    .line 38
    const/4 v10, 0x1

    .line 39
    if-ne v8, v9, :cond_1

    .line 40
    .line 41
    move v11, v10

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v11, v2

    .line 44
    :goto_0
    if-eqz v11, :cond_2

    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x2

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    move v1, v5

    .line 53
    :cond_2
    const/16 v5, 0x2d

    .line 54
    .line 55
    if-ne v8, v5, :cond_3

    .line 56
    .line 57
    add-int/lit8 v2, v1, 0x1

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    move v1, v2

    .line 64
    move v2, v10

    .line 65
    :cond_3
    const/16 v5, 0x30

    .line 66
    .line 67
    const/4 v12, -0x1

    .line 68
    if-lt v8, v5, :cond_15

    .line 69
    .line 70
    const/16 v13, 0x39

    .line 71
    .line 72
    if-gt v8, v13, :cond_15

    .line 73
    .line 74
    sub-int/2addr v8, v5

    .line 75
    int-to-long v14, v8

    .line 76
    :goto_1
    add-int/lit8 v8, v1, 0x1

    .line 77
    .line 78
    move-wide/from16 v16, v6

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-lt v6, v5, :cond_4

    .line 85
    .line 86
    if-gt v6, v13, :cond_4

    .line 87
    .line 88
    const-wide/16 v18, 0xa

    .line 89
    .line 90
    mul-long v14, v14, v18

    .line 91
    .line 92
    add-int/lit8 v6, v6, -0x30

    .line 93
    .line 94
    int-to-long v6, v6

    .line 95
    add-long/2addr v14, v6

    .line 96
    move v1, v8

    .line 97
    move-wide/from16 v6, v16

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const/16 v5, 0x2e

    .line 101
    .line 102
    if-ne v6, v5, :cond_5

    .line 103
    .line 104
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 105
    .line 106
    return-wide v16

    .line 107
    :cond_5
    if-eqz v11, :cond_7

    .line 108
    .line 109
    if-eq v6, v9, :cond_6

    .line 110
    .line 111
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 112
    .line 113
    return-wide v16

    .line 114
    :cond_6
    add-int/lit8 v1, v1, 0x2

    .line 115
    .line 116
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    move v8, v1

    .line 121
    :cond_7
    const/16 v1, 0x7d

    .line 122
    .line 123
    const/16 v5, 0x2c

    .line 124
    .line 125
    if-eq v6, v5, :cond_8

    .line 126
    .line 127
    if-ne v6, v1, :cond_9

    .line 128
    .line 129
    :cond_8
    add-int/lit8 v7, v8, -0x1

    .line 130
    .line 131
    iput v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 132
    .line 133
    :cond_9
    cmp-long v7, v14, v16

    .line 134
    .line 135
    if-gez v7, :cond_b

    .line 136
    .line 137
    const-wide/high16 v18, -0x8000000000000000L

    .line 138
    .line 139
    cmp-long v7, v14, v18

    .line 140
    .line 141
    if-nez v7, :cond_a

    .line 142
    .line 143
    if-eqz v2, :cond_a

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_a
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 147
    .line 148
    iput-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 149
    .line 150
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 151
    .line 152
    return-wide v16

    .line 153
    :cond_b
    :goto_2
    const/16 v7, 0x10

    .line 154
    .line 155
    if-ne v6, v5, :cond_c

    .line 156
    .line 157
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 158
    .line 159
    add-int/2addr v1, v10

    .line 160
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 167
    .line 168
    const/4 v1, 0x3

    .line 169
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 170
    .line 171
    iput v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 172
    .line 173
    if-eqz v2, :cond_10

    .line 174
    .line 175
    neg-long v1, v14

    .line 176
    return-wide v1

    .line 177
    :cond_c
    if-ne v6, v1, :cond_13

    .line 178
    .line 179
    iget v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 180
    .line 181
    add-int/2addr v6, v10

    .line 182
    iput v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 183
    .line 184
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    :goto_3
    if-ne v6, v5, :cond_d

    .line 189
    .line 190
    iput v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 191
    .line 192
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 193
    .line 194
    add-int/2addr v1, v10

    .line 195
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_d
    const/16 v8, 0x5d

    .line 205
    .line 206
    if-ne v6, v8, :cond_e

    .line 207
    .line 208
    const/16 v1, 0xf

    .line 209
    .line 210
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 211
    .line 212
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 213
    .line 214
    add-int/2addr v1, v10

    .line 215
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_e
    if-ne v6, v1, :cond_f

    .line 225
    .line 226
    const/16 v1, 0xd

    .line 227
    .line 228
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 229
    .line 230
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 231
    .line 232
    add-int/2addr v1, v10

    .line 233
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_f
    const/16 v8, 0x1a

    .line 243
    .line 244
    if-ne v6, v8, :cond_11

    .line 245
    .line 246
    const/16 v1, 0x14

    .line 247
    .line 248
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 249
    .line 250
    :goto_4
    const/4 v1, 0x4

    .line 251
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 252
    .line 253
    if-eqz v2, :cond_10

    .line 254
    .line 255
    neg-long v1, v14

    .line 256
    return-wide v1

    .line 257
    :cond_10
    return-wide v14

    .line 258
    :cond_11
    invoke-static {v6}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_12

    .line 263
    .line 264
    iget v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 265
    .line 266
    add-int/2addr v6, v10

    .line 267
    iput v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 268
    .line 269
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    goto :goto_3

    .line 274
    :cond_12
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 275
    .line 276
    iput-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 277
    .line 278
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 279
    .line 280
    return-wide v16

    .line 281
    :cond_13
    invoke-static {v6}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-eqz v6, :cond_14

    .line 286
    .line 287
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 288
    .line 289
    add-int/lit8 v6, v8, 0x1

    .line 290
    .line 291
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    move v8, v6

    .line 296
    move v6, v7

    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :cond_14
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 300
    .line 301
    return-wide v16

    .line 302
    :cond_15
    move-wide/from16 v16, v6

    .line 303
    .line 304
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 305
    .line 306
    iput-char v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 307
    .line 308
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 309
    .line 310
    return-wide v16
.end method

.method public scanFieldString([C)Ljava/lang/String;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 3
    .line 4
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 5
    .line 6
    iget-char v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 7
    .line 8
    :cond_0
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 9
    .line 10
    iget v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 11
    .line 12
    invoke-static {v3, v4, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_2

    .line 17
    .line 18
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 19
    .line 20
    invoke-static {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 30
    .line 31
    invoke-static {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, -0x2

    .line 42
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringDefaultValue()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 50
    .line 51
    array-length v4, p1

    .line 52
    add-int/2addr v3, v4

    .line 53
    add-int/lit8 v4, v3, 0x1

    .line 54
    .line 55
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/16 v5, 0x22

    .line 60
    .line 61
    const/4 v6, -0x1

    .line 62
    move v7, v0

    .line 63
    if-eq v3, v5, :cond_4

    .line 64
    .line 65
    :goto_1
    invoke-static {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_3

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    add-int/lit8 v3, v4, 0x1

    .line 74
    .line 75
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    move v11, v4

    .line 80
    move v4, v3

    .line 81
    move v3, v11

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    if-eq v3, v5, :cond_4

    .line 84
    .line 85
    iput v6, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringDefaultValue()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_4
    invoke-virtual {p0, v5, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->indexOf(CI)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eq v3, v6, :cond_11

    .line 97
    .line 98
    sub-int v8, v3, v4

    .line 99
    .line 100
    invoke-virtual {p0, v4, v8}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const/16 v8, 0x5c

    .line 105
    .line 106
    invoke-virtual {v4, v8}, Ljava/lang/String;->indexOf(I)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eq v9, v6, :cond_7

    .line 111
    .line 112
    :goto_2
    add-int/lit8 v4, v3, -0x1

    .line 113
    .line 114
    move v9, v0

    .line 115
    :goto_3
    if-ltz v4, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-ne v10, v8, :cond_5

    .line 122
    .line 123
    add-int/lit8 v9, v9, 0x1

    .line 124
    .line 125
    add-int/lit8 v4, v4, -0x1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    rem-int/lit8 v9, v9, 0x2

    .line 129
    .line 130
    if-nez v9, :cond_6

    .line 131
    .line 132
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 133
    .line 134
    array-length v4, p1

    .line 135
    add-int/2addr v4, v0

    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    add-int/2addr v4, v7

    .line 139
    sub-int v4, v3, v4

    .line 140
    .line 141
    array-length p1, p1

    .line 142
    add-int/2addr v0, p1

    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    add-int/2addr v0, v7

    .line 146
    invoke-virtual {p0, v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->sub_chars(II)[C

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1, v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->readString([CI)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    goto :goto_4

    .line 155
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 156
    .line 157
    invoke-virtual {p0, v5, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->indexOf(CI)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    :goto_4
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->features:I

    .line 163
    .line 164
    sget-object v0, Lcom/alibaba/fastjson/parser/Feature;->TrimStringFieldValue:Lcom/alibaba/fastjson/parser/Feature;

    .line 165
    .line 166
    iget v0, v0, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    .line 167
    .line 168
    and-int/2addr p1, v0

    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    :cond_8
    add-int/lit8 p1, v3, 0x1

    .line 176
    .line 177
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    :goto_5
    const/16 v0, 0x7d

    .line 182
    .line 183
    const/16 v5, 0x2c

    .line 184
    .line 185
    if-eq p1, v5, :cond_b

    .line 186
    .line 187
    if-ne p1, v0, :cond_9

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_a

    .line 195
    .line 196
    add-int/lit8 p1, v3, 0x1

    .line 197
    .line 198
    add-int/lit8 v3, v3, 0x2

    .line 199
    .line 200
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    move v3, p1

    .line 205
    move p1, v0

    .line 206
    goto :goto_5

    .line 207
    :cond_a
    iput v6, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 208
    .line 209
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringDefaultValue()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    return-object p1

    .line 214
    :cond_b
    :goto_6
    add-int/lit8 v7, v3, 0x1

    .line 215
    .line 216
    iput v7, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 217
    .line 218
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 219
    .line 220
    if-ne p1, v5, :cond_c

    .line 221
    .line 222
    add-int/lit8 v3, v3, 0x2

    .line 223
    .line 224
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 225
    .line 226
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 231
    .line 232
    const/4 p1, 0x3

    .line 233
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 234
    .line 235
    return-object v4

    .line 236
    :cond_c
    add-int/lit8 v3, v3, 0x2

    .line 237
    .line 238
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 239
    .line 240
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    if-ne p1, v5, :cond_d

    .line 245
    .line 246
    const/16 p1, 0x10

    .line 247
    .line 248
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 249
    .line 250
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 251
    .line 252
    add-int/lit8 p1, p1, 0x1

    .line 253
    .line 254
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 255
    .line 256
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_d
    const/16 v3, 0x5d

    .line 264
    .line 265
    if-ne p1, v3, :cond_e

    .line 266
    .line 267
    const/16 p1, 0xf

    .line 268
    .line 269
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 270
    .line 271
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 272
    .line 273
    add-int/lit8 p1, p1, 0x1

    .line 274
    .line 275
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 276
    .line 277
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_e
    if-ne p1, v0, :cond_f

    .line 285
    .line 286
    const/16 p1, 0xd

    .line 287
    .line 288
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 289
    .line 290
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 291
    .line 292
    add-int/lit8 p1, p1, 0x1

    .line 293
    .line 294
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 295
    .line 296
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_f
    const/16 v0, 0x1a

    .line 304
    .line 305
    if-ne p1, v0, :cond_10

    .line 306
    .line 307
    const/16 p1, 0x14

    .line 308
    .line 309
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 310
    .line 311
    :goto_7
    const/4 p1, 0x4

    .line 312
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 313
    .line 314
    return-object v4

    .line 315
    :cond_10
    iput v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 316
    .line 317
    iput-char v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 318
    .line 319
    iput v6, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 320
    .line 321
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringDefaultValue()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    return-object p1

    .line 326
    :cond_11
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 327
    .line 328
    const-string v0, "unclosed str"

    .line 329
    .line 330
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw p1
.end method

.method public scanFieldStringArray([CLjava/lang/Class;)Ljava/util/Collection;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([C",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 1
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 2
    :goto_0
    iget-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v4, 0xa

    if-eq v3, v4, :cond_0

    const/16 v4, 0x20

    if-ne v3, v4, :cond_1

    :cond_0
    move-object/from16 v3, p2

    const/16 v6, 0x1a

    const/16 v16, 0x1

    goto/16 :goto_b

    .line 3
    :cond_1
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-static {v3, v4, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    const/4 v1, -0x2

    .line 4
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v4

    :cond_2
    move-object/from16 v3, p2

    .line 5
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->newCollectionByType(Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object v3

    .line 6
    iget v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    iget-char v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 8
    array-length v1, v1

    add-int/2addr v1, v7

    add-int/lit8 v9, v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v10

    const/16 v11, 0x5b

    .line 10
    const-string v12, "ull"

    const/16 v13, 0x5d

    const/16 v14, 0x2c

    const/4 v15, -0x1

    if-ne v10, v11, :cond_c

    add-int/lit8 v1, v1, 0x2

    .line 11
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v9

    :goto_1
    const/16 v10, 0x22

    if-ne v9, v10, :cond_7

    .line 12
    invoke-virtual {v0, v10, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->indexOf(CI)I

    move-result v9

    if-eq v9, v15, :cond_6

    sub-int v11, v9, v1

    .line 13
    invoke-virtual {v0, v1, v11}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    move-result-object v11

    const/16 v2, 0x5c

    const/16 v16, 0x1

    .line 14
    invoke-virtual {v11, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v15, :cond_5

    :goto_2
    add-int/lit8 v6, v9, -0x1

    const/4 v11, 0x0

    :goto_3
    if-ltz v6, :cond_3

    .line 15
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v5

    if-ne v5, v2, :cond_3

    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    .line 16
    :cond_3
    rem-int/lit8 v11, v11, 0x2

    if-nez v11, :cond_4

    sub-int v2, v9, v1

    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->sub_chars(II)[C

    move-result-object v1

    .line 18
    invoke-static {v1, v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->readString([CI)Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 19
    invoke-virtual {v0, v10, v9}, Lcom/alibaba/fastjson/parser/JSONScanner;->indexOf(CI)I

    move-result v9

    goto :goto_2

    :cond_5
    :goto_4
    add-int/lit8 v1, v9, 0x1

    add-int/lit8 v9, v9, 0x2

    .line 20
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 21
    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 22
    :cond_6
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    const-string v2, "unclosed str"

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    const/16 v16, 0x1

    const/16 v2, 0x6e

    if-ne v9, v2, :cond_a

    .line 23
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v2, v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_a

    add-int/lit8 v2, v1, 0x3

    add-int/lit8 v9, v1, 0x4

    .line 24
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 25
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_5
    if-ne v1, v14, :cond_8

    add-int/lit8 v1, v9, 0x1

    .line 26
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v9

    const/4 v2, 0x0

    goto :goto_1

    :cond_8
    if-ne v1, v13, :cond_9

    add-int/lit8 v1, v9, 0x1

    .line 27
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    .line 28
    :goto_6
    invoke-static {v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result v5

    if-eqz v5, :cond_d

    add-int/lit8 v2, v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    move/from16 v17, v2

    move v2, v1

    move/from16 v1, v17

    goto :goto_6

    .line 30
    :cond_9
    iput v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v4

    :cond_a
    if-ne v9, v13, :cond_b

    .line 31
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v2

    if-nez v2, :cond_b

    add-int/lit8 v2, v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    move/from16 v17, v2

    move v2, v1

    move/from16 v1, v17

    goto :goto_7

    .line 33
    :cond_b
    iput v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v4

    :cond_c
    const/16 v16, 0x1

    .line 34
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v2, v12, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_16

    add-int/lit8 v2, v1, 0x4

    add-int/lit8 v1, v1, 0x5

    .line 35
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    move-object v3, v4

    .line 36
    :cond_d
    :goto_7
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    if-ne v2, v14, :cond_e

    .line 37
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/4 v1, 0x3

    .line 38
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3

    :cond_e
    const/16 v5, 0x7d

    if-ne v2, v5, :cond_15

    .line 39
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v2

    :goto_8
    if-ne v2, v14, :cond_f

    const/16 v1, 0x10

    .line 40
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 41
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    goto :goto_9

    :cond_f
    if-ne v2, v13, :cond_10

    const/16 v1, 0xf

    .line 42
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 43
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    goto :goto_9

    :cond_10
    if-ne v2, v5, :cond_11

    const/16 v1, 0xd

    .line 44
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 45
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    goto :goto_9

    :cond_11
    const/16 v6, 0x1a

    if-ne v2, v6, :cond_12

    const/16 v1, 0x14

    .line 46
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 47
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    :goto_9
    const/4 v1, 0x4

    .line 48
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3

    :cond_12
    const/4 v7, 0x0

    .line 49
    :goto_a
    invoke-static {v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result v8

    if-eqz v8, :cond_13

    add-int/lit8 v2, v1, 0x1

    .line 50
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    move-result v1

    .line 51
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    move v7, v2

    move v2, v1

    move v1, v7

    move/from16 v7, v16

    goto :goto_a

    :cond_13
    if-eqz v7, :cond_14

    goto :goto_8

    .line 52
    :cond_14
    iput v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v4

    .line 53
    :cond_15
    iput-char v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 54
    iput v7, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 55
    iput v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v4

    .line 56
    :cond_16
    iput v15, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v4

    .line 57
    :goto_b
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 58
    iget v4, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    if-lt v2, v4, :cond_17

    move v5, v6

    goto :goto_c

    :cond_17
    iget-object v4, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 59
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_c
    iput-char v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/4 v2, 0x0

    goto/16 :goto_0
.end method

.method public scanFieldStringArray([CILcom/alibaba/fastjson/parser/SymbolTable;)[Ljava/lang/String;
    .locals 8

    .line 60
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 61
    iget-char v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 62
    :goto_0
    iget-char v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    invoke-static {v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz p1, :cond_4

    .line 64
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 65
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare([C)Z

    move-result v5

    if-nez v5, :cond_1

    const/4 p1, -0x2

    .line 66
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3

    .line 67
    :cond_1
    iget v5, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    array-length p1, p1

    add-int/2addr v5, p1

    .line 68
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result p1

    .line 69
    :goto_1
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 70
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    add-int/lit8 v5, v6, 0x1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result p1

    move v6, v5

    goto :goto_1

    :cond_2
    const/16 v5, 0x3a

    if-ne p1, v5, :cond_3

    .line 71
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    add-int/lit8 v5, v6, 0x1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result p1

    .line 72
    :goto_2
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 73
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result p1

    move v5, v6

    goto :goto_2

    .line 74
    :cond_3
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3

    .line 75
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v5, p1, 0x1

    .line 76
    iget-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    :cond_5
    const/16 v6, 0x5b

    const/4 v7, 0x4

    if-ne p1, v6, :cond_f

    .line 77
    iput v5, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 78
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result p1

    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ltz p2, :cond_6

    .line 79
    new-array p1, p2, [Ljava/lang/String;

    goto :goto_3

    :cond_6
    new-array p1, v7, [Ljava/lang/String;

    :goto_3
    move p2, v4

    .line 80
    :goto_4
    iget-char v5, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    invoke-static {v5}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 81
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_4

    .line 82
    :cond_7
    iget-char v5, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v6, 0x22

    if-eq v5, v6, :cond_8

    .line 83
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 84
    iput-char v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 85
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3

    .line 86
    :cond_8
    invoke-virtual {p0, p3, v6}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanSymbol(Lcom/alibaba/fastjson/parser/SymbolTable;C)Ljava/lang/String;

    move-result-object v5

    .line 87
    array-length v6, p1

    if-ne p2, v6, :cond_9

    .line 88
    array-length v6, p1

    array-length v7, p1

    shr-int/lit8 v7, v7, 0x1

    add-int/2addr v6, v7

    add-int/lit8 v6, v6, 0x1

    .line 89
    new-array v6, v6, [Ljava/lang/String;

    .line 90
    array-length v7, p1

    invoke-static {p1, v4, v6, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v6

    :cond_9
    add-int/lit8 v6, p2, 0x1

    .line 91
    aput-object v5, p1, p2

    .line 92
    :goto_5
    iget-char p2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    invoke-static {p2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 93
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_5

    .line 94
    :cond_a
    iget-char p2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v5, 0x2c

    if-ne p2, v5, :cond_b

    .line 95
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    move p2, v6

    goto :goto_4

    .line 96
    :cond_b
    array-length p2, p1

    if-eq p2, v6, :cond_c

    .line 97
    new-array p2, v6, [Ljava/lang/String;

    .line 98
    invoke-static {p1, v4, p2, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, p2

    .line 99
    :cond_c
    :goto_6
    iget-char p2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    invoke-static {p2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    move-result p2

    if-eqz p2, :cond_d

    .line 100
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_6

    .line 101
    :cond_d
    iget-char p2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 p3, 0x5d

    if-ne p2, p3, :cond_e

    .line 102
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    return-object p1

    .line 103
    :cond_e
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 104
    iput-char v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 105
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3

    :cond_f
    const/16 p2, 0x6e

    if-ne p1, p2, :cond_10

    .line 106
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget p2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 p2, p2, 0x1

    const-string p3, "ull"

    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 107
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr p1, v7

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 108
    iget-object p2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    return-object v3

    .line 109
    :cond_10
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v3
.end method

.method public scanFieldSymbol([C)J
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 3
    .line 4
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 5
    .line 6
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    .line 8
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charArrayCompare(Ljava/lang/String;I[C)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 17
    .line 18
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 28
    .line 29
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p1, -0x2

    .line 40
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 41
    .line 42
    return-wide v1

    .line 43
    :cond_2
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 44
    .line 45
    array-length p1, p1

    .line 46
    add-int/2addr v0, p1

    .line 47
    add-int/lit8 p1, v0, 0x1

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/16 v3, 0x22

    .line 54
    .line 55
    const/4 v4, -0x1

    .line 56
    if-eq v0, v3, :cond_4

    .line 57
    .line 58
    :goto_1
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    add-int/lit8 v0, p1, 0x1

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    move v9, v0

    .line 71
    move v0, p1

    .line 72
    move p1, v9

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    if-eq v0, v3, :cond_4

    .line 75
    .line 76
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 77
    .line 78
    return-wide v1

    .line 79
    :cond_4
    const-wide v5, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    :goto_2
    add-int/lit8 v0, p1, 0x1

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-ne p1, v3, :cond_c

    .line 91
    .line 92
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 99
    .line 100
    :goto_3
    const/16 v0, 0x2c

    .line 101
    .line 102
    if-ne p1, v0, :cond_5

    .line 103
    .line 104
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 105
    .line 106
    add-int/lit8 p1, p1, 0x1

    .line 107
    .line 108
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 115
    .line 116
    const/4 p1, 0x3

    .line 117
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 118
    .line 119
    return-wide v5

    .line 120
    :cond_5
    const/16 v3, 0x7d

    .line 121
    .line 122
    if-ne p1, v3, :cond_a

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getCurrent()C

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-ne p1, v0, :cond_6

    .line 135
    .line 136
    const/16 p1, 0x10

    .line 137
    .line 138
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 139
    .line 140
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 141
    .line 142
    add-int/lit8 p1, p1, 0x1

    .line 143
    .line 144
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    const/16 v0, 0x5d

    .line 154
    .line 155
    if-ne p1, v0, :cond_7

    .line 156
    .line 157
    const/16 p1, 0xf

    .line 158
    .line 159
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 160
    .line 161
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 162
    .line 163
    add-int/lit8 p1, p1, 0x1

    .line 164
    .line 165
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_7
    if-ne p1, v3, :cond_8

    .line 175
    .line 176
    const/16 p1, 0xd

    .line 177
    .line 178
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 179
    .line 180
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 181
    .line 182
    add-int/lit8 p1, p1, 0x1

    .line 183
    .line 184
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 185
    .line 186
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_8
    const/16 v0, 0x1a

    .line 194
    .line 195
    if-ne p1, v0, :cond_9

    .line 196
    .line 197
    const/16 p1, 0x14

    .line 198
    .line 199
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 200
    .line 201
    :goto_4
    const/4 p1, 0x4

    .line 202
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 203
    .line 204
    return-wide v5

    .line 205
    :cond_9
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 206
    .line 207
    return-wide v1

    .line 208
    :cond_a
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-eqz p1, :cond_b

    .line 213
    .line 214
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 215
    .line 216
    add-int/lit8 p1, p1, 0x1

    .line 217
    .line 218
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 219
    .line 220
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    goto :goto_3

    .line 225
    :cond_b
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 226
    .line 227
    return-wide v1

    .line 228
    :cond_c
    iget v7, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    .line 229
    .line 230
    if-le v0, v7, :cond_d

    .line 231
    .line 232
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 233
    .line 234
    return-wide v1

    .line 235
    :cond_d
    int-to-long v7, p1

    .line 236
    xor-long/2addr v5, v7

    .line 237
    const-wide v7, 0x100000001b3L

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    mul-long/2addr v5, v7

    .line 243
    move p1, v0

    .line 244
    goto/16 :goto_2
.end method

.method public scanISO8601DateIfMatch()Z
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->scanISO8601DateIfMatch(Z)Z

    move-result v0

    return v0
.end method

.method public scanISO8601DateIfMatch(Z)Z
    .locals 2

    .line 2
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    sub-int/2addr v0, v1

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->scanISO8601DateIfMatch(ZI)Z

    move-result p1

    return p1
.end method

.method public final scanInt(C)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    :goto_0
    invoke-static {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    add-int/lit8 v4, v3, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    move v15, v4

    .line 27
    move v4, v3

    .line 28
    move v3, v15

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v5, 0x22

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    if-ne v4, v5, :cond_1

    .line 34
    .line 35
    move v7, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v7, v1

    .line 38
    :goto_1
    if-eqz v7, :cond_2

    .line 39
    .line 40
    add-int/lit8 v4, v3, 0x1

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    move v15, v4

    .line 47
    move v4, v3

    .line 48
    move v3, v15

    .line 49
    :cond_2
    const/16 v8, 0x2d

    .line 50
    .line 51
    if-ne v4, v8, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move v6, v1

    .line 55
    :goto_2
    if-eqz v6, :cond_4

    .line 56
    .line 57
    add-int/lit8 v4, v3, 0x1

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    move v15, v4

    .line 64
    move v4, v3

    .line 65
    move v3, v15

    .line 66
    :cond_4
    const/16 v8, 0x10

    .line 67
    .line 68
    const/16 v9, 0x30

    .line 69
    .line 70
    const/4 v10, -0x1

    .line 71
    if-lt v4, v9, :cond_e

    .line 72
    .line 73
    const/16 v11, 0x39

    .line 74
    .line 75
    if-gt v4, v11, :cond_e

    .line 76
    .line 77
    sub-int/2addr v4, v9

    .line 78
    :goto_3
    add-int/lit8 v12, v3, 0x1

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    if-lt v13, v9, :cond_6

    .line 85
    .line 86
    if-gt v13, v11, :cond_6

    .line 87
    .line 88
    mul-int/lit8 v14, v4, 0xa

    .line 89
    .line 90
    if-lt v14, v4, :cond_5

    .line 91
    .line 92
    add-int/lit8 v13, v13, -0x30

    .line 93
    .line 94
    add-int v4, v14, v13

    .line 95
    .line 96
    move v3, v12

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    .line 99
    .line 100
    new-instance v4, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v5, "parseInt error : "

    .line 106
    .line 107
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_6
    const/16 v2, 0x2e

    .line 126
    .line 127
    if-ne v13, v2, :cond_7

    .line 128
    .line 129
    iput v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 130
    .line 131
    return v1

    .line 132
    :cond_7
    if-eqz v7, :cond_9

    .line 133
    .line 134
    if-eq v13, v5, :cond_8

    .line 135
    .line 136
    iput v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 137
    .line 138
    return v1

    .line 139
    :cond_8
    add-int/lit8 v3, v3, 0x2

    .line 140
    .line 141
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    move v12, v3

    .line 146
    :cond_9
    if-gez v4, :cond_a

    .line 147
    .line 148
    iput v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 149
    .line 150
    return v1

    .line 151
    :cond_a
    move/from16 v1, p1

    .line 152
    .line 153
    :goto_4
    if-ne v13, v1, :cond_b

    .line 154
    .line 155
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 156
    .line 157
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 162
    .line 163
    const/4 v1, 0x3

    .line 164
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 165
    .line 166
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 167
    .line 168
    if-eqz v6, :cond_d

    .line 169
    .line 170
    neg-int v1, v4

    .line 171
    return v1

    .line 172
    :cond_b
    invoke-static {v13}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_c

    .line 177
    .line 178
    add-int/lit8 v2, v12, 0x1

    .line 179
    .line 180
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    move v12, v2

    .line 185
    goto :goto_4

    .line 186
    :cond_c
    iput v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 187
    .line 188
    if-eqz v6, :cond_d

    .line 189
    .line 190
    neg-int v1, v4

    .line 191
    return v1

    .line 192
    :cond_d
    return v4

    .line 193
    :cond_e
    const/16 v2, 0x6e

    .line 194
    .line 195
    if-ne v4, v2, :cond_13

    .line 196
    .line 197
    add-int/lit8 v2, v3, 0x1

    .line 198
    .line 199
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    const/16 v6, 0x75

    .line 204
    .line 205
    if-ne v4, v6, :cond_13

    .line 206
    .line 207
    add-int/lit8 v4, v3, 0x2

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    const/16 v6, 0x6c

    .line 214
    .line 215
    if-ne v2, v6, :cond_13

    .line 216
    .line 217
    add-int/lit8 v2, v3, 0x3

    .line 218
    .line 219
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-ne v4, v6, :cond_13

    .line 224
    .line 225
    const/4 v4, 0x5

    .line 226
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 227
    .line 228
    add-int/lit8 v6, v3, 0x4

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v7, :cond_f

    .line 235
    .line 236
    if-ne v2, v5, :cond_f

    .line 237
    .line 238
    add-int/2addr v3, v4

    .line 239
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    move v6, v3

    .line 244
    :cond_f
    :goto_5
    const/16 v3, 0x2c

    .line 245
    .line 246
    if-ne v2, v3, :cond_10

    .line 247
    .line 248
    iput v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 249
    .line 250
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 255
    .line 256
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 257
    .line 258
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 259
    .line 260
    return v1

    .line 261
    :cond_10
    const/16 v3, 0x5d

    .line 262
    .line 263
    if-ne v2, v3, :cond_11

    .line 264
    .line 265
    iput v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 266
    .line 267
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    iput-char v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 272
    .line 273
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 274
    .line 275
    const/16 v2, 0xf

    .line 276
    .line 277
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 278
    .line 279
    return v1

    .line 280
    :cond_11
    invoke-static {v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_12

    .line 285
    .line 286
    add-int/lit8 v2, v6, 0x1

    .line 287
    .line 288
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    move v6, v2

    .line 293
    move v2, v3

    .line 294
    goto :goto_5

    .line 295
    :cond_12
    iput v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 296
    .line 297
    return v1

    .line 298
    :cond_13
    iput v10, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 299
    .line 300
    return v1
.end method

.method public scanLong(C)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x1

    .line 15
    const/16 v6, 0x22

    .line 16
    .line 17
    if-ne v4, v6, :cond_0

    .line 18
    .line 19
    move v7, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v7, v1

    .line 22
    :goto_0
    if-eqz v7, :cond_1

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x2

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    move v3, v2

    .line 31
    :cond_1
    const/16 v2, 0x2d

    .line 32
    .line 33
    if-ne v4, v2, :cond_2

    .line 34
    .line 35
    move v1, v5

    .line 36
    :cond_2
    if-eqz v1, :cond_3

    .line 37
    .line 38
    add-int/lit8 v2, v3, 0x1

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    move v3, v2

    .line 45
    :cond_3
    const/16 v2, 0x10

    .line 46
    .line 47
    const/16 v5, 0x30

    .line 48
    .line 49
    const/4 v8, -0x1

    .line 50
    const-wide/16 v9, 0x0

    .line 51
    .line 52
    if-lt v4, v5, :cond_d

    .line 53
    .line 54
    const/16 v11, 0x39

    .line 55
    .line 56
    if-gt v4, v11, :cond_d

    .line 57
    .line 58
    sub-int/2addr v4, v5

    .line 59
    int-to-long v12, v4

    .line 60
    :goto_1
    add-int/lit8 v4, v3, 0x1

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-lt v14, v5, :cond_4

    .line 67
    .line 68
    if-gt v14, v11, :cond_4

    .line 69
    .line 70
    const-wide/16 v15, 0xa

    .line 71
    .line 72
    mul-long/2addr v12, v15

    .line 73
    add-int/lit8 v14, v14, -0x30

    .line 74
    .line 75
    int-to-long v14, v14

    .line 76
    add-long/2addr v12, v14

    .line 77
    move v3, v4

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const/16 v5, 0x2e

    .line 80
    .line 81
    if-ne v14, v5, :cond_5

    .line 82
    .line 83
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 84
    .line 85
    return-wide v9

    .line 86
    :cond_5
    if-eqz v7, :cond_7

    .line 87
    .line 88
    if-eq v14, v6, :cond_6

    .line 89
    .line 90
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 91
    .line 92
    return-wide v9

    .line 93
    :cond_6
    add-int/lit8 v3, v3, 0x2

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    move v4, v3

    .line 100
    :cond_7
    cmp-long v3, v12, v9

    .line 101
    .line 102
    if-gez v3, :cond_9

    .line 103
    .line 104
    const-wide/high16 v5, -0x8000000000000000L

    .line 105
    .line 106
    cmp-long v3, v12, v5

    .line 107
    .line 108
    if-nez v3, :cond_8

    .line 109
    .line 110
    if-eqz v1, :cond_8

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_8
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 114
    .line 115
    return-wide v9

    .line 116
    :cond_9
    :goto_2
    move/from16 v3, p1

    .line 117
    .line 118
    :goto_3
    if-ne v14, v3, :cond_b

    .line 119
    .line 120
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 121
    .line 122
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    iput-char v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 127
    .line 128
    const/4 v3, 0x3

    .line 129
    iput v3, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 130
    .line 131
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 132
    .line 133
    if-eqz v1, :cond_a

    .line 134
    .line 135
    neg-long v1, v12

    .line 136
    return-wide v1

    .line 137
    :cond_a
    return-wide v12

    .line 138
    :cond_b
    invoke-static {v14}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_c

    .line 143
    .line 144
    add-int/lit8 v5, v4, 0x1

    .line 145
    .line 146
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    move v4, v5

    .line 151
    goto :goto_3

    .line 152
    :cond_c
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 153
    .line 154
    return-wide v12

    .line 155
    :cond_d
    const/16 v1, 0x6e

    .line 156
    .line 157
    if-ne v4, v1, :cond_12

    .line 158
    .line 159
    add-int/lit8 v1, v3, 0x1

    .line 160
    .line 161
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    const/16 v5, 0x75

    .line 166
    .line 167
    if-ne v4, v5, :cond_12

    .line 168
    .line 169
    add-int/lit8 v4, v3, 0x2

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    const/16 v5, 0x6c

    .line 176
    .line 177
    if-ne v1, v5, :cond_12

    .line 178
    .line 179
    add-int/lit8 v1, v3, 0x3

    .line 180
    .line 181
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-ne v4, v5, :cond_12

    .line 186
    .line 187
    const/4 v4, 0x5

    .line 188
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 189
    .line 190
    add-int/lit8 v5, v3, 0x4

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v7, :cond_e

    .line 197
    .line 198
    if-ne v1, v6, :cond_e

    .line 199
    .line 200
    add-int/2addr v3, v4

    .line 201
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    move v5, v3

    .line 206
    :cond_e
    :goto_4
    const/16 v3, 0x2c

    .line 207
    .line 208
    if-ne v1, v3, :cond_f

    .line 209
    .line 210
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 211
    .line 212
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 217
    .line 218
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 219
    .line 220
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 221
    .line 222
    return-wide v9

    .line 223
    :cond_f
    const/16 v3, 0x5d

    .line 224
    .line 225
    if-ne v1, v3, :cond_10

    .line 226
    .line 227
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 228
    .line 229
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 234
    .line 235
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 236
    .line 237
    const/16 v1, 0xf

    .line 238
    .line 239
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 240
    .line 241
    return-wide v9

    .line 242
    :cond_10
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isWhitespace(C)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_11

    .line 247
    .line 248
    add-int/lit8 v1, v5, 0x1

    .line 249
    .line 250
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    move v5, v1

    .line 255
    move v1, v3

    .line 256
    goto :goto_4

    .line 257
    :cond_11
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 258
    .line 259
    return-wide v9

    .line 260
    :cond_12
    iput v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    .line 261
    .line 262
    return-wide v9
.end method

.method public scanTypeName(Lcom/alibaba/fastjson/parser/SymbolTable;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "\"@type\":\""

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 15
    .line 16
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x9

    .line 19
    .line 20
    const/16 v3, 0x22

    .line 21
    .line 22
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->indexOf(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x9

    .line 32
    .line 33
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    if-ge v2, v0, :cond_0

    .line 37
    .line 38
    mul-int/lit8 v3, v3, 0x1f

    .line 39
    .line 40
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/2addr v3, v4

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 51
    .line 52
    sub-int v4, v0, v2

    .line 53
    .line 54
    invoke-virtual {p0, v2, v4, v3, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->addSymbol(IIILcom/alibaba/fastjson/parser/SymbolTable;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 59
    .line 60
    add-int/lit8 v3, v0, 0x1

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/16 v3, 0x2c

    .line 67
    .line 68
    if-eq v2, v3, :cond_1

    .line 69
    .line 70
    const/16 v3, 0x5d

    .line 71
    .line 72
    if-eq v2, v3, :cond_1

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_1
    add-int/lit8 v0, v0, 0x2

    .line 76
    .line 77
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 78
    .line 79
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iput-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_2
    return-object v1
.end method

.method public seekArrayToItem(I)Z
    .locals 10

    .line 1
    if-ltz p1, :cond_e

    .line 2
    .line 3
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 4
    .line 5
    const/16 v1, 0x14

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    const/16 v1, 0xe

    .line 12
    .line 13
    if-ne v0, v1, :cond_d

    .line 14
    .line 15
    move v0, v2

    .line 16
    :goto_0
    const/4 v3, 0x1

    .line 17
    if-ge v0, p1, :cond_c

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 20
    .line 21
    .line 22
    iget-char v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 23
    .line 24
    const/16 v5, 0x22

    .line 25
    .line 26
    const-string v6, "illegal json."

    .line 27
    .line 28
    const/16 v7, 0x5d

    .line 29
    .line 30
    const/16 v8, 0x2c

    .line 31
    .line 32
    const/16 v9, 0x10

    .line 33
    .line 34
    if-eq v4, v5, :cond_9

    .line 35
    .line 36
    const/16 v5, 0x27

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/16 v5, 0x7b

    .line 42
    .line 43
    if-ne v4, v5, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 46
    .line 47
    .line 48
    const/16 v3, 0xc

    .line 49
    .line 50
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipObject(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/16 v5, 0x5b

    .line 57
    .line 58
    if-ne v4, v5, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 61
    .line 62
    .line 63
    iput v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipArray(Z)V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 69
    .line 70
    if-ne v3, v9, :cond_3

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_3
    const/16 p1, 0xf

    .line 74
    .line 75
    if-ne v3, p1, :cond_4

    .line 76
    .line 77
    return v2

    .line 78
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_5
    iget v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 85
    .line 86
    add-int/2addr v4, v3

    .line 87
    :goto_2
    iget-object v5, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-ge v4, v5, :cond_8

    .line 94
    .line 95
    iget-object v5, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-ne v5, v8, :cond_6

    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 106
    .line 107
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iput-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    if-ne v5, v7, :cond_7

    .line 115
    .line 116
    add-int/2addr v4, v3

    .line 117
    iput v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 118
    .line 119
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson/parser/JSONScanner;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 126
    .line 127
    .line 128
    return v2

    .line 129
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_8
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 133
    .line 134
    invoke-direct {p1, v6}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_9
    :goto_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipString()V

    .line 139
    .line 140
    .line 141
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 142
    .line 143
    if-ne v3, v8, :cond_a

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 146
    .line 147
    .line 148
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_a
    if-ne v3, v7, :cond_b

    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 158
    .line 159
    .line 160
    return v2

    .line 161
    :cond_b
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 162
    .line 163
    invoke-direct {p1, v6}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 168
    .line 169
    .line 170
    return v3

    .line 171
    :cond_d
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 172
    .line 173
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 178
    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v2, "index must > 0, but "

    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0
.end method

.method public seekObjectToField(JZ)I
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    const/16 v2, 0x14

    const/4 v3, -0x1

    if-ne v1, v2, :cond_0

    return v3

    :cond_0
    const/16 v2, 0xd

    if-eq v1, v2, :cond_1

    const/16 v4, 0xf

    if-ne v1, v4, :cond_2

    :cond_1
    move/from16 v16, v3

    goto/16 :goto_11

    :cond_2
    const/16 v5, 0x10

    const/16 v6, 0xc

    if-eq v1, v6, :cond_4

    if-ne v1, v5, :cond_3

    goto :goto_0

    .line 2
    :cond_3
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    iget v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    invoke-static {v2}, Lcom/alibaba/fastjson/parser/JSONToken;->name(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 3
    :cond_4
    :goto_0
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v7, 0x7d

    if-ne v1, v7, :cond_5

    .line 4
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 5
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    return v3

    :cond_5
    const/16 v8, 0x1a

    if-ne v1, v8, :cond_6

    return v3

    :cond_6
    const/16 v9, 0x22

    if-eq v1, v9, :cond_7

    .line 6
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 7
    :cond_7
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v9, :cond_36

    .line 8
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/4 v10, 0x1

    add-int/2addr v1, v10

    const-wide v11, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    :goto_1
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v1, v13, :cond_c

    .line 9
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v13, v1}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x5c

    if-ne v13, v14, :cond_9

    add-int/lit8 v1, v1, 0x1

    .line 10
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-eq v1, v13, :cond_8

    .line 11
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v13, v1}, Ljava/lang/String;->charAt(I)C

    move-result v13

    goto :goto_2

    .line 12
    :cond_8
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unclosed str, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_2
    if-ne v13, v9, :cond_b

    add-int/lit8 v1, v1, 0x1

    .line 13
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 14
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-lt v1, v13, :cond_a

    move v1, v8

    goto :goto_3

    :cond_a
    iget-object v1, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget v13, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 15
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v1

    :goto_3
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    goto :goto_4

    :cond_b
    int-to-long v13, v13

    xor-long/2addr v11, v13

    const-wide v13, 0x100000001b3L

    mul-long/2addr v11, v13

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_c
    :goto_4
    cmp-long v1, v11, p1

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/16 v13, 0x3a

    const/16 v14, 0x39

    const/16 v15, 0x30

    move/from16 v16, v3

    const/16 v3, 0x2c

    if-nez v1, :cond_17

    .line 16
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v13, :cond_d

    .line 17
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 18
    :cond_d
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v13, :cond_16

    .line 19
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 20
    iget-object v6, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lt v1, v6, :cond_e

    move v1, v8

    goto :goto_5

    :cond_e
    iget-object v6, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 21
    invoke-virtual {v6, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    :goto_5
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v3, :cond_10

    .line 22
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 23
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v1, v2, :cond_f

    goto :goto_6

    :cond_f
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_6
    iput-char v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 25
    iput v5, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    goto :goto_9

    :cond_10
    const/16 v3, 0x5d

    if-ne v1, v3, :cond_12

    .line 26
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 27
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v1, v2, :cond_11

    goto :goto_7

    :cond_11
    iget-object v2, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_7
    iput-char v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 29
    iput v4, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    goto :goto_9

    :cond_12
    if-ne v1, v7, :cond_14

    .line 30
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 31
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_13

    goto :goto_8

    :cond_13
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 32
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_8
    iput-char v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 33
    iput v2, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    goto :goto_9

    :cond_14
    if-lt v1, v15, :cond_15

    if-gt v1, v14, :cond_15

    .line 34
    iput v12, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 35
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->pos:I

    .line 36
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanNumber()V

    goto :goto_9

    .line 37
    :cond_15
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    :cond_16
    :goto_9
    const/4 v1, 0x3

    return v1

    .line 38
    :cond_17
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v13, :cond_18

    .line 39
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 40
    :cond_18
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v13, :cond_35

    .line 41
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 42
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-lt v1, v13, :cond_19

    move v1, v8

    goto :goto_a

    :cond_19
    iget-object v13, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 43
    invoke-virtual {v13, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    :goto_a
    iput-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v13, 0x5b

    const/16 v4, 0x7b

    const/16 v5, 0x2d

    const/16 v8, 0x2b

    move/from16 v17, v10

    if-eq v1, v9, :cond_1a

    const/16 v10, 0x27

    if-eq v1, v10, :cond_1a

    if-eq v1, v4, :cond_1a

    if-eq v1, v13, :cond_1a

    if-eq v1, v15, :cond_1a

    const/16 v10, 0x31

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x32

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x33

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x34

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x35

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x36

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x37

    if-eq v1, v10, :cond_1a

    const/16 v10, 0x38

    if-eq v1, v10, :cond_1a

    if-eq v1, v14, :cond_1a

    if-eq v1, v8, :cond_1a

    if-eq v1, v5, :cond_1a

    .line 44
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 45
    :cond_1a
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v10, 0x65

    if-eq v1, v5, :cond_2c

    if-eq v1, v8, :cond_2c

    if-lt v1, v15, :cond_1b

    if-gt v1, v14, :cond_1b

    goto/16 :goto_c

    :cond_1b
    if-ne v1, v9, :cond_1d

    .line 46
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipString()V

    .line 47
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v3, :cond_1c

    if-eq v1, v7, :cond_1c

    .line 48
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 49
    :cond_1c
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v3, :cond_34

    .line 50
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto/16 :goto_10

    :cond_1d
    const/16 v5, 0x74

    const/16 v8, 0x75

    if-ne v1, v5, :cond_20

    .line 51
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 52
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v4, 0x72

    if-ne v1, v4, :cond_1e

    .line 53
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 54
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v8, :cond_1e

    .line 55
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 56
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v10, :cond_1e

    .line 57
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 58
    :cond_1e
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v3, :cond_1f

    if-eq v1, v7, :cond_1f

    .line 59
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 60
    :cond_1f
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v3, :cond_34

    .line 61
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto/16 :goto_10

    :cond_20
    const/16 v5, 0x6e

    const/16 v9, 0x6c

    if-ne v1, v5, :cond_23

    .line 62
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 63
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v8, :cond_21

    .line 64
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 65
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v9, :cond_21

    .line 66
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 67
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v9, :cond_21

    .line 68
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 69
    :cond_21
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v3, :cond_22

    if-eq v1, v7, :cond_22

    .line 70
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 71
    :cond_22
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v3, :cond_34

    .line 72
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto/16 :goto_10

    :cond_23
    const/16 v5, 0x66

    if-ne v1, v5, :cond_26

    .line 73
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 74
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v4, 0x61

    if-ne v1, v4, :cond_24

    .line 75
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 76
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v9, :cond_24

    .line 77
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 78
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v4, 0x73

    if-ne v1, v4, :cond_24

    .line 79
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 80
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v10, :cond_24

    .line 81
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 82
    :cond_24
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v3, :cond_25

    if-eq v1, v7, :cond_25

    .line 83
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 84
    :cond_25
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v3, :cond_34

    .line 85
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto/16 :goto_10

    :cond_26
    if-ne v1, v4, :cond_29

    .line 86
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 87
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_27

    const/16 v8, 0x1a

    goto :goto_b

    :cond_27
    iget-object v3, v0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 88
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_b
    iput-char v8, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eqz p3, :cond_28

    .line 89
    iput v6, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v17

    .line 90
    :cond_28
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipObject(Z)V

    .line 91
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    if-ne v1, v2, :cond_34

    return v16

    :cond_29
    if-ne v1, v13, :cond_2b

    .line 92
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    if-eqz p3, :cond_2a

    const/16 v1, 0xe

    .line 93
    iput v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return v11

    .line 94
    :cond_2a
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipArray(Z)V

    .line 95
    iget v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    if-ne v1, v2, :cond_34

    return v16

    .line 96
    :cond_2b
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    .line 97
    :cond_2c
    :goto_c
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 98
    :goto_d
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-lt v1, v15, :cond_2d

    if-gt v1, v14, :cond_2d

    .line 99
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_d

    :cond_2d
    const/16 v4, 0x2e

    if-ne v1, v4, :cond_2e

    .line 100
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 101
    :goto_e
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-lt v1, v15, :cond_2e

    if-gt v1, v14, :cond_2e

    .line 102
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_e

    .line 103
    :cond_2e
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v4, 0x45

    if-eq v1, v4, :cond_2f

    if-ne v1, v10, :cond_32

    .line 104
    :cond_2f
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 105
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v5, :cond_30

    if-ne v1, v8, :cond_31

    .line 106
    :cond_30
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 107
    :cond_31
    :goto_f
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-lt v1, v15, :cond_32

    if-gt v1, v14, :cond_32

    .line 108
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_f

    .line 109
    :cond_32
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v1, v3, :cond_33

    .line 110
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 111
    :cond_33
    iget-char v1, v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v1, v3, :cond_34

    .line 112
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    :cond_34
    :goto_10
    move/from16 v3, v16

    const/16 v4, 0xf

    const/16 v5, 0x10

    goto/16 :goto_0

    .line 113
    :cond_35
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "illegal json, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 114
    :cond_36
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    .line 115
    :goto_11
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    return v16
.end method

.method public seekObjectToField([J)I
    .locals 14

    .line 116
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    const/16 v1, 0xc

    const/16 v2, 0x10

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 117
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 118
    :cond_1
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v1, 0x7d

    const/4 v3, -0x1

    if-ne v0, v1, :cond_2

    .line 119
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 120
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 121
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return v3

    :cond_2
    const/16 v4, 0x1a

    if-ne v0, v4, :cond_3

    .line 122
    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return v3

    :cond_3
    const/16 v5, 0x22

    if-eq v0, v5, :cond_4

    .line 123
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 124
    :cond_4
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v0, v5, :cond_29

    .line 125
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v0, v0, 0x1

    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    :goto_1
    iget-object v8, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v0, v8, :cond_9

    .line 126
    iget-object v8, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x5c

    if-ne v8, v9, :cond_6

    add-int/lit8 v0, v0, 0x1

    .line 127
    iget-object v8, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v0, v8, :cond_5

    .line 128
    iget-object v8, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v8

    goto :goto_2

    .line 129
    :cond_5
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unclosed str, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    if-ne v8, v5, :cond_8

    add-int/lit8 v0, v0, 0x1

    .line 130
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 131
    iget-object v8, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lt v0, v8, :cond_7

    move v0, v4

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget v8, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 132
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v0

    :goto_3
    iput-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    goto :goto_4

    :cond_8
    int-to-long v8, v8

    xor-long/2addr v6, v8

    const-wide v8, 0x100000001b3L

    mul-long/2addr v6, v8

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_9
    :goto_4
    const/4 v0, 0x0

    move v8, v0

    .line 133
    :goto_5
    array-length v9, p1

    if-ge v8, v9, :cond_b

    .line 134
    aget-wide v9, p1, v8

    cmp-long v9, v6, v9

    if-nez v9, :cond_a

    goto :goto_6

    :cond_a
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_b
    move v8, v3

    :goto_6
    const/16 v6, 0x3a

    const/16 v7, 0x2c

    const/16 v9, 0x39

    const/16 v10, 0x30

    if-eq v8, v3, :cond_16

    .line 135
    iget-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq p1, v6, :cond_c

    .line 136
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 137
    :cond_c
    iget-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne p1, v6, :cond_15

    .line 138
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 139
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt p1, v3, :cond_d

    move p1, v4

    goto :goto_7

    :cond_d
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 140
    invoke-virtual {v3, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    :goto_7
    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne p1, v7, :cond_f

    .line 141
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 142
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_e

    goto :goto_8

    :cond_e
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 143
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    :goto_8
    iput-char v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 144
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    goto :goto_b

    :cond_f
    const/16 v2, 0x5d

    if-ne p1, v2, :cond_11

    .line 145
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 146
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_10

    goto :goto_9

    :cond_10
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    :goto_9
    iput-char v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 p1, 0xf

    .line 148
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    goto :goto_b

    :cond_11
    if-ne p1, v1, :cond_13

    .line 149
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 150
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_12

    goto :goto_a

    :cond_12
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    :goto_a
    iput-char v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 p1, 0xd

    .line 152
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    goto :goto_b

    :cond_13
    if-lt p1, v10, :cond_14

    if-gt p1, v9, :cond_14

    .line 153
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 154
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->pos:I

    .line 155
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanNumber()V

    goto :goto_b

    :cond_14
    const/4 p1, 0x2

    .line 156
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    :cond_15
    :goto_b
    const/4 p1, 0x3

    .line 157
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return v8

    .line 158
    :cond_16
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v3, v6, :cond_17

    .line 159
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 160
    :cond_17
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v3, v6, :cond_28

    .line 161
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 162
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lt v3, v6, :cond_18

    move v3, v4

    goto :goto_c

    :cond_18
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 163
    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    :goto_c
    iput-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v6, 0x5b

    const/16 v8, 0x7b

    const/16 v11, 0x2d

    const/16 v12, 0x2b

    if-eq v3, v5, :cond_19

    const/16 v13, 0x27

    if-eq v3, v13, :cond_19

    if-eq v3, v8, :cond_19

    if-eq v3, v6, :cond_19

    if-eq v3, v10, :cond_19

    const/16 v13, 0x31

    if-eq v3, v13, :cond_19

    const/16 v13, 0x32

    if-eq v3, v13, :cond_19

    const/16 v13, 0x33

    if-eq v3, v13, :cond_19

    const/16 v13, 0x34

    if-eq v3, v13, :cond_19

    const/16 v13, 0x35

    if-eq v3, v13, :cond_19

    const/16 v13, 0x36

    if-eq v3, v13, :cond_19

    const/16 v13, 0x37

    if-eq v3, v13, :cond_19

    const/16 v13, 0x38

    if-eq v3, v13, :cond_19

    if-eq v3, v9, :cond_19

    if-eq v3, v12, :cond_19

    if-eq v3, v11, :cond_19

    .line 164
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 165
    :cond_19
    iget-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v3, v11, :cond_20

    if-eq v3, v12, :cond_20

    if-lt v3, v10, :cond_1a

    if-gt v3, v9, :cond_1a

    goto :goto_e

    :cond_1a
    if-ne v3, v5, :cond_1c

    .line 166
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipString()V

    .line 167
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v0, v7, :cond_1b

    if-eq v0, v1, :cond_1b

    .line 168
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 169
    :cond_1b
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v0, v7, :cond_1

    .line 170
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto/16 :goto_0

    :cond_1c
    if-ne v3, v8, :cond_1e

    .line 171
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 172
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_1d

    goto :goto_d

    :cond_1d
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 173
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    :goto_d
    iput-char v4, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 174
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipObject(Z)V

    goto/16 :goto_0

    :cond_1e
    if-ne v3, v6, :cond_1f

    .line 175
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 176
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipArray(Z)V

    goto/16 :goto_0

    .line 177
    :cond_1f
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 178
    :cond_20
    :goto_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 179
    :goto_f
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-lt v0, v10, :cond_21

    if-gt v0, v9, :cond_21

    .line 180
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_f

    :cond_21
    const/16 v1, 0x2e

    if-ne v0, v1, :cond_22

    .line 181
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 182
    :goto_10
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-lt v0, v10, :cond_22

    if-gt v0, v9, :cond_22

    .line 183
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_10

    .line 184
    :cond_22
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v1, 0x45

    if-eq v0, v1, :cond_23

    const/16 v1, 0x65

    if-ne v0, v1, :cond_26

    .line 185
    :cond_23
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 186
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v0, v11, :cond_24

    if-ne v0, v12, :cond_25

    .line 187
    :cond_24
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    .line 188
    :cond_25
    :goto_11
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-lt v0, v10, :cond_26

    if-gt v0, v9, :cond_26

    .line 189
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto :goto_11

    .line 190
    :cond_26
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-eq v0, v7, :cond_27

    .line 191
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipWhitespace()V

    .line 192
    :cond_27
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    if-ne v0, v7, :cond_1

    .line 193
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    goto/16 :goto_0

    .line 194
    :cond_28
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "illegal json, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 195
    :cond_29
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public setTime(CCCCCC)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x30

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0xa

    .line 4
    .line 5
    add-int/lit8 p2, p2, -0x30

    .line 6
    .line 7
    add-int/2addr p1, p2

    .line 8
    add-int/lit8 p3, p3, -0x30

    .line 9
    .line 10
    mul-int/lit8 p3, p3, 0xa

    .line 11
    .line 12
    add-int/lit8 p4, p4, -0x30

    .line 13
    .line 14
    add-int/2addr p3, p4

    .line 15
    add-int/lit8 p5, p5, -0x30

    .line 16
    .line 17
    mul-int/lit8 p5, p5, 0xa

    .line 18
    .line 19
    add-int/lit8 p6, p6, -0x30

    .line 20
    .line 21
    add-int/2addr p5, p6

    .line 22
    iget-object p2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 23
    .line 24
    const/16 p4, 0xb

    .line 25
    .line 26
    invoke-virtual {p2, p4, p1}, Ljava/util/Calendar;->set(II)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 30
    .line 31
    const/16 p2, 0xc

    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    .line 37
    .line 38
    const/16 p2, 0xd

    .line 39
    .line 40
    invoke-virtual {p1, p2, p5}, Ljava/util/Calendar;->set(II)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setTimeZone(CCC)V
    .locals 6

    const/16 v4, 0x30

    const/16 v5, 0x30

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson/parser/JSONScanner;->setTimeZone(CCCCC)V

    return-void
.end method

.method public setTimeZone(CCCCC)V
    .locals 0

    add-int/lit8 p2, p2, -0x30

    mul-int/lit8 p2, p2, 0xa

    add-int/lit8 p3, p3, -0x30

    add-int/2addr p2, p3

    const p3, 0x36ee80

    mul-int/2addr p2, p3

    add-int/lit8 p4, p4, -0x30

    mul-int/lit8 p4, p4, 0xa

    add-int/lit8 p5, p5, -0x30

    add-int/2addr p4, p5

    const p3, 0xea60

    mul-int/2addr p4, p3

    add-int/2addr p2, p4

    const/16 p3, 0x2d

    if-ne p1, p3, :cond_0

    neg-int p2, p2

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p1

    if-eq p1, p2, :cond_1

    .line 3
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->calendar:Ljava/util/Calendar;

    new-instance p3, Ljava/util/SimpleTimeZone;

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p2, p4}, Ljava/util/SimpleTimeZone;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_1
    return-void
.end method

.method public final skipArray()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipArray(Z)V

    return-void
.end method

.method public final skipArray(Z)V
    .locals 6

    .line 2
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/4 v1, 0x0

    move v2, v1

    .line 3
    :goto_0
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "illegal str, "

    if-ge v0, v3, :cond_a

    .line 4
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x5c

    if-ne v3, v5, :cond_1

    .line 5
    iget v5, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    add-int/lit8 v5, v5, -0x1

    if-ge v0, v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    .line 6
    :cond_0
    iput-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 7
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 8
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 v4, 0x22

    if-ne v3, v4, :cond_2

    xor-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    const/16 v4, 0x5b

    if-ne v3, v4, :cond_4

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    const/16 v4, 0x7b

    const/16 v5, 0x1a

    if-ne v3, v4, :cond_6

    if-eqz p1, :cond_6

    .line 9
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 10
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lt v3, v4, :cond_5

    goto :goto_1

    :cond_5
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 11
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_1
    iput-char v5, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 12
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipObject(Z)V

    goto :goto_2

    :cond_6
    const/16 v4, 0x5d

    if-ne v3, v4, :cond_9

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v2, v2, -0x1

    const/4 v3, -0x1

    if-ne v2, v3, :cond_9

    add-int/lit8 v0, v0, 0x1

    .line 13
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 14
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ne v0, p1, :cond_8

    .line 15
    iput-char v5, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 p1, 0x14

    .line 16
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return-void

    .line 17
    :cond_8
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 p1, 0x10

    .line 18
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    return-void

    :cond_9
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 19
    :cond_a
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eq v0, p1, :cond_b

    return-void

    .line 20
    :cond_b
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final skipObject()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/JSONScanner;->skipObject(Z)V

    return-void
.end method

.method public final skipObject(Z)V
    .locals 6

    .line 2
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    .line 3
    :goto_0
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "illegal str, "

    if-ge p1, v3, :cond_c

    .line 4
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x5c

    if-ne v3, v5, :cond_1

    .line 5
    iget v5, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    add-int/lit8 v5, v5, -0x1

    if-ge p1, v5, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_2

    .line 6
    :cond_0
    iput-char v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 7
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 8
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 v4, 0x22

    if-ne v3, v4, :cond_2

    xor-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    :cond_2
    const/16 v4, 0x7b

    if-ne v3, v4, :cond_4

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    const/16 v4, 0x7d

    if-ne v3, v4, :cond_b

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, -0x1

    const/4 v3, -0x1

    if-ne v2, v3, :cond_b

    add-int/lit8 p1, p1, 0x1

    .line 9
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 10
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1a

    if-ne p1, v0, :cond_6

    .line 11
    iput-char v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 p1, 0x14

    .line 12
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    return-void

    .line 13
    :cond_6
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    iput-char p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    const/16 v0, 0x2c

    const/16 v2, 0x10

    if-ne p1, v0, :cond_8

    .line 14
    iput v2, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 15
    iget p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_7

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    :goto_1
    iput-char v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    return-void

    :cond_8
    if-ne p1, v4, :cond_9

    const/16 p1, 0xd

    .line 18
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    return-void

    :cond_9
    const/16 v0, 0x5d

    if-ne p1, v0, :cond_a

    const/16 p1, 0xf

    .line 20
    iput p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token:I

    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->next()C

    return-void

    .line 22
    :cond_a
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    return-void

    :cond_b
    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    .line 23
    :cond_c
    :goto_3
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    if-ge v0, v1, :cond_e

    .line 24
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_d

    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_d

    add-int/lit8 p1, p1, 0x1

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 25
    :cond_e
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq p1, v0, :cond_f

    return-void

    .line 26
    :cond_f
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/fastjson/parser/JSONScanner;->info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final skipString()V
    .locals 4

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_3

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 8
    .line 9
    :cond_0
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v0, v2, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/16 v3, 0x5c

    .line 26
    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->len:I

    .line 30
    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    if-ge v0, v2, :cond_0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-ne v2, v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    iput v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->bp:I

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput-char v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->ch:C

    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    .line 54
    .line 55
    const-string v1, "unclosed str"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public final stringVal()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->hasSpecial:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->np:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson/parser/JSONScanner;->subString(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iget v3, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sp:I

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final subString(II)Ljava/lang/String;
    .locals 4

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson/util/ASMUtils;->IS_ANDROID:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ge p2, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 12
    .line 13
    add-int v3, p1, p2

    .line 14
    .line 15
    invoke-virtual {v1, p1, v3, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 21
    .line 22
    invoke-direct {p1, v0, v2, p2}, Ljava/lang/String;-><init>([CII)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-array v0, p2, [C

    .line 27
    .line 28
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 29
    .line 30
    add-int/2addr p2, p1

    .line 31
    invoke-virtual {v1, p1, p2, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 41
    .line 42
    add-int/2addr p2, p1

    .line 43
    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final sub_chars(II)[C
    .locals 3

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson/util/ASMUtils;->IS_ANDROID:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 7
    .line 8
    array-length v2, v0

    .line 9
    if-ge p2, v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 12
    .line 13
    add-int/2addr p2, p1

    .line 14
    invoke-virtual {v2, p1, p2, v0, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/JSONLexerBase;->sbuf:[C

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    new-array v0, p2, [C

    .line 21
    .line 22
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/JSONScanner;->text:Ljava/lang/String;

    .line 23
    .line 24
    add-int/2addr p2, p1

    .line 25
    invoke-virtual {v2, p1, p2, v0, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
