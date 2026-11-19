.class public final Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final booleanArrayDescriptor:Lu8/f;

.field private static final charArrayDescriptor:Lu8/f;

.field private static final doubleArrayDescriptor:Lu8/f;

.field private static final floatArrayDescriptor:Lu8/f;

.field private static final intArrayDescriptor:Lu8/f;

.field private static final intListDescriptor:Lu8/f;

.field private static final longArrayDescriptor:Lu8/f;

.field private static final stringArrayDescriptor:Lu8/f;

.field private static final stringListDescriptor:Lu8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/t;

    .line 2
    .line 3
    invoke-static {v0}, Lt8/a;->E(Lkotlin/jvm/internal/t;)Ls8/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt8/a;->h(Ls8/b;)Ls8/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ls8/b;->getDescriptor()Lu8/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intListDescriptor:Lu8/f;

    .line 16
    .line 17
    sget-object v0, Lkotlin/jvm/internal/c0;->a:Lkotlin/jvm/internal/c0;

    .line 18
    .line 19
    invoke-static {v0}, Lt8/a;->H(Lkotlin/jvm/internal/c0;)Ls8/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lt8/a;->h(Ls8/b;)Ls8/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringListDescriptor:Lu8/f;

    .line 32
    .line 33
    invoke-static {}, Lt8/a;->b()Ls8/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->booleanArrayDescriptor:Lu8/f;

    .line 42
    .line 43
    invoke-static {}, Lt8/a;->d()Ls8/b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->charArrayDescriptor:Lu8/f;

    .line 52
    .line 53
    invoke-static {}, Lt8/a;->e()Ls8/b;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->doubleArrayDescriptor:Lu8/f;

    .line 62
    .line 63
    invoke-static {}, Lt8/a;->f()Ls8/b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->floatArrayDescriptor:Lu8/f;

    .line 72
    .line 73
    invoke-static {}, Lt8/a;->g()Ls8/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intArrayDescriptor:Lu8/f;

    .line 82
    .line 83
    invoke-static {}, Lt8/a;->i()Ls8/b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->longArrayDescriptor:Lu8/f;

    .line 92
    .line 93
    invoke-static {v0}, Lt8/a;->H(Lkotlin/jvm/internal/c0;)Ls8/b;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-class v1, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v1, v0}, Lt8/a;->a(Le8/c;Ls8/b;)Ls8/b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Ls8/b;->getDescriptor()Lu8/f;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringArrayDescriptor:Lu8/f;

    .line 112
    .line 113
    return-void
.end method

.method public static final getBooleanArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->booleanArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getCharArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->charArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDoubleArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->doubleArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getFloatArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->floatArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getIntArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getIntListDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intListDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getLongArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->longArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getStringArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getStringArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getStringListDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringListDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method
