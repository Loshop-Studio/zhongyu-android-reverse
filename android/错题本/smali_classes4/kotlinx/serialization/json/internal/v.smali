.class public final Lkotlinx/serialization/json/internal/v;
.super Ll7/b;
.source "SourceFile"


# instance fields
.field public final a:Lb0/k0;

.field public final b:Ln7/b;

.field public final c:Lkotlinx/serialization/json/internal/WriteMode;

.field public final d:[Lkotlinx/serialization/json/internal/v;

.field public final e:Lo7/e;

.field public final f:Ln7/g;

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb0/k0;Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/internal/v;)V
    .locals 1

    .line 1
    const-string v0, "composer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "json"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 15
    .line 16
    iput-object p2, p0, Lkotlinx/serialization/json/internal/v;->b:Ln7/b;

    .line 17
    .line 18
    iput-object p3, p0, Lkotlinx/serialization/json/internal/v;->c:Lkotlinx/serialization/json/internal/WriteMode;

    .line 19
    .line 20
    iput-object p4, p0, Lkotlinx/serialization/json/internal/v;->d:[Lkotlinx/serialization/json/internal/v;

    .line 21
    .line 22
    iget-object p1, p2, Ln7/b;->b:Lo7/e;

    .line 23
    .line 24
    iput-object p1, p0, Lkotlinx/serialization/json/internal/v;->e:Lo7/e;

    .line 25
    .line 26
    iget-object p1, p2, Ln7/b;->a:Ln7/g;

    .line 27
    .line 28
    iput-object p1, p0, Lkotlinx/serialization/json/internal/v;->f:Ln7/g;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p4, :cond_1

    .line 35
    .line 36
    aget-object p2, p4, p1

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    if-eq p2, p0, :cond_1

    .line 41
    .line 42
    :cond_0
    aput-object p0, p4, p1

    .line 43
    .line 44
    :cond_1
    return-void
.end method


# virtual methods
.method public final beginStructure(Lk7/g;)Ll7/d;
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->b:Ln7/b;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlinx/serialization/json/internal/j;->q(Lk7/g;Ln7/b;)Lkotlinx/serialization/json/internal/WriteMode;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-char v2, v1, Lkotlinx/serialization/json/internal/WriteMode;->begin:C

    .line 13
    .line 14
    iget-object v3, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lb0/k0;->c(C)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    iput-boolean v2, v3, Lb0/k0;->a:Z

    .line 23
    .line 24
    :cond_0
    iget-object v2, p0, Lkotlinx/serialization/json/internal/v;->h:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iget-object v4, p0, Lkotlinx/serialization/json/internal/v;->i:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, Lk7/g;->h()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    invoke-virtual {v3}, Lb0/k0;->a()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x3a

    .line 43
    .line 44
    invoke-virtual {v3, p1}, Lb0/k0;->c(C)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lkotlinx/serialization/json/internal/v;->h:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p0, Lkotlinx/serialization/json/internal/v;->i:Ljava/lang/String;

    .line 57
    .line 58
    :cond_2
    iget-object p1, p0, Lkotlinx/serialization/json/internal/v;->c:Lkotlinx/serialization/json/internal/WriteMode;

    .line 59
    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    iget-object p1, p0, Lkotlinx/serialization/json/internal/v;->d:[Lkotlinx/serialization/json/internal/v;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    aget-object v2, p1, v2

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_4
    new-instance v2, Lkotlinx/serialization/json/internal/v;

    .line 77
    .line 78
    invoke-direct {v2, v3, v0, v1, p1}, Lkotlinx/serialization/json/internal/v;-><init>(Lb0/k0;Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/internal/v;)V

    .line 79
    .line 80
    .line 81
    return-object v2
.end method

.method public final encodeBoolean(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 14
    .line 15
    iget-object v0, v0, Lb0/k0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ld2/c;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Ld2/c;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final encodeByte(B)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lb0/k0;->b(B)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final encodeChar(C)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final encodeDouble(D)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v1, Lb0/k0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ld2/c;

    .line 18
    .line 19
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Ld2/c;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmpg-double v0, v2, v4

    .line 36
    .line 37
    if-gtz v0, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p2, v1, Lb0/k0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Ld2/c;

    .line 47
    .line 48
    invoke-virtual {p2}, Ld2/c;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p1, p2}, Lkotlinx/serialization/json/internal/j;->b(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1
.end method

.method public final encodeElement(Lk7/g;I)Z
    .locals 7

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlinx/serialization/json/internal/u;->a:[I

    .line 7
    .line 8
    iget-object v1, p0, Lkotlinx/serialization/json/internal/v;->c:Lkotlinx/serialization/json/internal/WriteMode;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    aget v0, v0, v1

    .line 15
    .line 16
    const/16 v1, 0x2c

    .line 17
    .line 18
    iget-object v2, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v0, v3, :cond_7

    .line 22
    .line 23
    const/16 v4, 0x3a

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x2

    .line 27
    if-eq v0, v6, :cond_4

    .line 28
    .line 29
    const/4 v6, 0x3

    .line 30
    if-eq v0, v6, :cond_1

    .line 31
    .line 32
    iget-boolean v0, v2, Lb0/k0;->a:Z

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lb0/k0;->c(C)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v2}, Lb0/k0;->a()V

    .line 40
    .line 41
    .line 42
    const-string v0, "json"

    .line 43
    .line 44
    iget-object v1, p0, Lkotlinx/serialization/json/internal/v;->b:Ln7/b;

    .line 45
    .line 46
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v1}, Lkotlinx/serialization/json/internal/j;->o(Lk7/g;Ln7/b;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p2}, Lk7/g;->e(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v4}, Lb0/k0;->c(C)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lb0/k0;->j()V

    .line 63
    .line 64
    .line 65
    return v3

    .line 66
    :cond_1
    if-nez p2, :cond_2

    .line 67
    .line 68
    iput-boolean v3, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 69
    .line 70
    :cond_2
    if-ne p2, v3, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lb0/k0;->c(C)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lb0/k0;->j()V

    .line 76
    .line 77
    .line 78
    iput-boolean v5, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 79
    .line 80
    :cond_3
    return v3

    .line 81
    :cond_4
    iget-boolean p1, v2, Lb0/k0;->a:Z

    .line 82
    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    rem-int/2addr p2, v6

    .line 86
    if-nez p2, :cond_5

    .line 87
    .line 88
    invoke-virtual {v2, v1}, Lb0/k0;->c(C)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lb0/k0;->a()V

    .line 92
    .line 93
    .line 94
    move v5, v3

    .line 95
    goto :goto_0

    .line 96
    :cond_5
    invoke-virtual {v2, v4}, Lb0/k0;->c(C)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lb0/k0;->j()V

    .line 100
    .line 101
    .line 102
    :goto_0
    iput-boolean v5, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 103
    .line 104
    return v3

    .line 105
    :cond_6
    iput-boolean v3, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 106
    .line 107
    invoke-virtual {v2}, Lb0/k0;->a()V

    .line 108
    .line 109
    .line 110
    return v3

    .line 111
    :cond_7
    iget-boolean p1, v2, Lb0/k0;->a:Z

    .line 112
    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    invoke-virtual {v2, v1}, Lb0/k0;->c(C)V

    .line 116
    .line 117
    .line 118
    :cond_8
    invoke-virtual {v2}, Lb0/k0;->a()V

    .line 119
    .line 120
    .line 121
    return v3
.end method

.method public final encodeEnum(Lk7/g;I)V
    .locals 1

    .line 1
    const-string v0, "enumDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, Lk7/g;->e(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final encodeFloat(F)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v1, Lb0/k0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ld2/c;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Ld2/c;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 31
    .line 32
    .line 33
    cmpg-float v0, v0, v2

    .line 34
    .line 35
    if-gtz v0, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, v1, Lb0/k0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ld2/c;

    .line 45
    .line 46
    invoke-virtual {v0}, Ld2/c;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p1, v0}, Lkotlinx/serialization/json/internal/j;->b(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    throw p1
.end method

.method public final encodeInline(Lk7/g;)Ll7/f;
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlinx/serialization/json/internal/w;->a(Lk7/g;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    iget-object v2, p0, Lkotlinx/serialization/json/internal/v;->c:Lkotlinx/serialization/json/internal/WriteMode;

    .line 12
    .line 13
    iget-object v3, p0, Lkotlinx/serialization/json/internal/v;->b:Ln7/b;

    .line 14
    .line 15
    iget-object v4, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    instance-of p1, v4, Lkotlinx/serialization/json/internal/g;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, v4, Lb0/k0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ld2/c;

    .line 27
    .line 28
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 29
    .line 30
    new-instance v4, Lkotlinx/serialization/json/internal/g;

    .line 31
    .line 32
    invoke-direct {v4, p1, v0}, Lkotlinx/serialization/json/internal/g;-><init>(Ld2/c;Z)V

    .line 33
    .line 34
    .line 35
    :goto_0
    new-instance p1, Lkotlinx/serialization/json/internal/v;

    .line 36
    .line 37
    invoke-direct {p1, v4, v3, v2, v1}, Lkotlinx/serialization/json/internal/v;-><init>(Lb0/k0;Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/internal/v;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    invoke-interface {p1}, Lk7/g;->isInline()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object v0, Ln7/k;->a:Lm7/f0;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    instance-of p1, v4, Lkotlinx/serialization/json/internal/f;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object p1, v4, Lb0/k0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ld2/c;

    .line 63
    .line 64
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 65
    .line 66
    new-instance v4, Lkotlinx/serialization/json/internal/f;

    .line 67
    .line 68
    invoke-direct {v4, p1, v0}, Lkotlinx/serialization/json/internal/f;-><init>(Ld2/c;Z)V

    .line 69
    .line 70
    .line 71
    :goto_1
    new-instance p1, Lkotlinx/serialization/json/internal/v;

    .line 72
    .line 73
    invoke-direct {p1, v4, v3, v2, v1}, Lkotlinx/serialization/json/internal/v;-><init>(Lb0/k0;Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/internal/v;)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_3
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->h:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {p1}, Lk7/g;->h()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lkotlinx/serialization/json/internal/v;->i:Ljava/lang/String;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_4
    invoke-super {p0, p1}, Ll7/b;->encodeInline(Lk7/g;)Ll7/f;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method

.method public final encodeInt(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lb0/k0;->d(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final encodeLong(J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lb0/k0;->e(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final encodeNull()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 2
    .line 3
    const-string v1, "null"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lb0/k0;->f(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serializer"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p4, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->f:Ln7/g;

    .line 14
    .line 15
    iget-boolean v0, v0, Ln7/g;->c:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Ll7/b;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final encodeSerializableValue(Li7/e;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->b:Ln7/b;

    .line 7
    .line 8
    iget-object v1, v0, Ln7/b;->a:Ln7/g;

    .line 9
    .line 10
    instance-of v2, p1, Lm7/b;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Ln7/g;->g:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 15
    .line 16
    sget-object v3, Lkotlinx/serialization/json/ClassDiscriminatorMode;->NONE:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 17
    .line 18
    if-eq v1, v3, :cond_3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, v1, Ln7/g;->g:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 22
    .line 23
    sget-object v3, Lkotlinx/serialization/json/internal/r;->a:[I

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    aget v1, v3, v1

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eq v1, v3, :cond_3

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v1, v3, :cond_3

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    if-ne v1, v3, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Li7/e;->getDescriptor()Lk7/g;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Lk7/g;->getKind()Lcoil3/network/g;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v3, Lk7/l;->b:Lk7/l;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    sget-object v3, Lk7/l;->e:Lk7/l;

    .line 57
    .line 58
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    :cond_1
    :goto_0
    invoke-interface {p1}, Li7/e;->getDescriptor()Lk7/g;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1, v0}, Lkotlinx/serialization/json/internal/j;->h(Lk7/g;Ln7/b;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 74
    .line 75
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_3
    const/4 v0, 0x0

    .line 80
    :goto_1
    if-eqz v2, :cond_b

    .line 81
    .line 82
    move-object v1, p1

    .line 83
    check-cast v1, Lm7/b;

    .line 84
    .line 85
    if-eqz p2, :cond_a

    .line 86
    .line 87
    invoke-static {v1, p0, p2}, Lv7/l;->j(Lm7/b;Ll7/f;Ljava/lang/Object;)Li7/e;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    instance-of p1, p1, Li7/d;

    .line 94
    .line 95
    if-nez p1, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-interface {v1}, Li7/e;->getDescriptor()Lk7/g;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v2, "<this>"

    .line 103
    .line 104
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lm7/y0;->b(Lk7/g;)Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_8

    .line 116
    .line 117
    :goto_2
    invoke-interface {v1}, Li7/e;->getDescriptor()Lk7/g;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {p1}, Lk7/g;->getKind()Lcoil3/network/g;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const-string v2, "kind"

    .line 126
    .line 127
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    instance-of v2, p1, Lk7/k;

    .line 131
    .line 132
    if-nez v2, :cond_7

    .line 133
    .line 134
    instance-of v2, p1, Lk7/f;

    .line 135
    .line 136
    if-nez v2, :cond_6

    .line 137
    .line 138
    instance-of p1, p1, Lk7/d;

    .line 139
    .line 140
    if-nez p1, :cond_5

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string p2, "Actual serializer for polymorphic cannot be polymorphic itself"

    .line 146
    .line 147
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string p2, "Primitives cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    .line 154
    .line 155
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string p2, "Enums cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    .line 162
    .line 163
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_8
    new-instance p1, Ljava/lang/ClassCastException;

    .line 168
    .line 169
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_9
    :goto_3
    move-object p1, v1

    .line 174
    goto :goto_4

    .line 175
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string p2, "Value for serializer "

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    check-cast v1, Li7/c;

    .line 183
    .line 184
    invoke-virtual {v1}, Li7/c;->getDescriptor()Lk7/g;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string p2, " should always be non-null. Please report issue to the kotlinx.serialization tracker."

    .line 192
    .line 193
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p2

    .line 210
    :cond_b
    :goto_4
    if-eqz v0, :cond_c

    .line 211
    .line 212
    invoke-interface {p1}, Li7/e;->getDescriptor()Lk7/g;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {v1}, Lk7/g;->h()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iput-object v0, p0, Lkotlinx/serialization/json/internal/v;->h:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v1, p0, Lkotlinx/serialization/json/internal/v;->i:Ljava/lang/String;

    .line 223
    .line 224
    :cond_c
    invoke-interface {p1, p0, p2}, Li7/e;->serialize(Ll7/f;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public final encodeShort(S)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/json/internal/v;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/v;->encodeString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lb0/k0;->g(S)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final encodeString(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lb0/k0;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final endStructure(Lk7/g;)V
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lkotlinx/serialization/json/internal/v;->c:Lkotlinx/serialization/json/internal/WriteMode;

    .line 7
    .line 8
    iget-char v0, p1, Lkotlinx/serialization/json/internal/WriteMode;->end:C

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->a:Lb0/k0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lb0/k0;->a:Z

    .line 19
    .line 20
    iget-char p1, p1, Lkotlinx/serialization/json/internal/WriteMode;->end:C

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lb0/k0;->c(C)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final getSerializersModule()Lo7/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/v;->e:Lo7/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final shouldEncodeElementDefault(Lk7/g;I)Z
    .locals 0

    .line 1
    const-string p2, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lkotlinx/serialization/json/internal/v;->f:Ln7/g;

    .line 7
    .line 8
    iget-boolean p1, p1, Ln7/g;->a:Z

    .line 9
    .line 10
    return p1
.end method
