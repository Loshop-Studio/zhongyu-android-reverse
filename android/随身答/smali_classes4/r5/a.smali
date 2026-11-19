.class public abstract Lr5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FFFF)F
    .locals 0

    .line 1
    sub-float/2addr p0, p2

    .line 2
    mul-float/2addr p0, p0

    .line 3
    sub-float/2addr p1, p3

    .line 4
    mul-float/2addr p1, p1

    .line 5
    add-float/2addr p0, p1

    .line 6
    float-to-double p0, p0

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    double-to-float p0, p0

    .line 12
    return p0
.end method

.method public static final b(FFFFFF)F
    .locals 3

    .line 1
    invoke-static {p0, p1, p2, p3}, Lr5/a;->a(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1, p4, p5}, Lr5/a;->a(FFFF)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p2, p3, p4, p5}, Lr5/a;->a(FFFF)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-float p2, p1, p0

    .line 14
    .line 15
    cmpg-float p2, p2, v0

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_0
    float-to-double p2, v0

    .line 22
    const-wide p4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmpg-double p4, p2, p4

    .line 28
    .line 29
    if-gtz p4, :cond_1

    .line 30
    .line 31
    return p0

    .line 32
    :cond_1
    mul-float p4, p1, p1

    .line 33
    .line 34
    mul-float p5, v0, v0

    .line 35
    .line 36
    mul-float v1, p0, p0

    .line 37
    .line 38
    add-float v2, p5, v1

    .line 39
    .line 40
    cmpl-float v2, p4, v2

    .line 41
    .line 42
    if-ltz v2, :cond_2

    .line 43
    .line 44
    const-string p1, "\u7ec4\u6210\u76f4\u89d2\u4e09\u89d2\u5f62\u6216\u949d\u89d2\u4e09\u89d2\u5f62\uff0c(x1,y1)\u4e3a\u76f4\u89d2\u6216\u949d\u89d2  "

    .line 45
    .line 46
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return p0

    .line 52
    :cond_2
    add-float/2addr p5, p4

    .line 53
    cmpl-float p4, v1, p5

    .line 54
    .line 55
    if-ltz p4, :cond_3

    .line 56
    .line 57
    const-string p0, "\u7ec4\u6210\u76f4\u89d2\u4e09\u89d2\u5f62\u6216\u949d\u89d2\u4e09\u89d2\u5f62\uff0c(x2,y2)\u4e3a\u76f4\u89d2\u6216\u949d\u89d2 "

    .line 58
    .line 59
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_3
    const-string p4, "\u7ec4\u6210\u9510\u89d2\u4e09\u89d2\u5f62\uff0c\u5219\u6c42\u4e09\u89d2\u5f62\u7684\u9ad8  "

    .line 66
    .line 67
    sget-object p5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 68
    .line 69
    invoke-virtual {p5, p4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    add-float p4, v0, p0

    .line 73
    .line 74
    add-float/2addr p4, p1

    .line 75
    const/4 p5, 0x2

    .line 76
    int-to-float v1, p5

    .line 77
    div-float/2addr p4, v1

    .line 78
    sub-float v0, p4, v0

    .line 79
    .line 80
    mul-float/2addr v0, p4

    .line 81
    sub-float p0, p4, p0

    .line 82
    .line 83
    mul-float/2addr v0, p0

    .line 84
    sub-float/2addr p4, p1

    .line 85
    mul-float/2addr v0, p4

    .line 86
    float-to-double p0, v0

    .line 87
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    int-to-double p4, p5

    .line 92
    mul-double/2addr p4, p0

    .line 93
    div-double/2addr p4, p2

    .line 94
    double-to-float p0, p4

    .line 95
    return p0
.end method
