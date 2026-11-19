.class public final Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final booleanArrayDescriptor:Lee/f;

.field private static final charArrayDescriptor:Lee/f;

.field private static final doubleArrayDescriptor:Lee/f;

.field private static final floatArrayDescriptor:Lee/f;

.field private static final intArrayDescriptor:Lee/f;

.field private static final intListDescriptor:Lee/f;

.field private static final longArrayDescriptor:Lee/f;

.field private static final stringArrayDescriptor:Lee/f;

.field private static final stringListDescriptor:Lee/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/t;

    .line 2
    .line 3
    invoke-static {v0}, Lde/a;->z(Lkotlin/jvm/internal/t;)Lce/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lde/a;->h(Lce/b;)Lce/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lce/b;->getDescriptor()Lee/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intListDescriptor:Lee/f;

    .line 16
    .line 17
    sget-object v0, Lkotlin/jvm/internal/c0;->a:Lkotlin/jvm/internal/c0;

    .line 18
    .line 19
    invoke-static {v0}, Lde/a;->C(Lkotlin/jvm/internal/c0;)Lce/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lde/a;->h(Lce/b;)Lce/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringListDescriptor:Lee/f;

    .line 32
    .line 33
    invoke-static {}, Lde/a;->b()Lce/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->booleanArrayDescriptor:Lee/f;

    .line 42
    .line 43
    invoke-static {}, Lde/a;->d()Lce/b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->charArrayDescriptor:Lee/f;

    .line 52
    .line 53
    invoke-static {}, Lde/a;->e()Lce/b;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->doubleArrayDescriptor:Lee/f;

    .line 62
    .line 63
    invoke-static {}, Lde/a;->f()Lce/b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->floatArrayDescriptor:Lee/f;

    .line 72
    .line 73
    invoke-static {}, Lde/a;->g()Lce/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intArrayDescriptor:Lee/f;

    .line 82
    .line 83
    invoke-static {}, Lde/a;->i()Lce/b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v1}, Lce/b;->getDescriptor()Lee/f;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->longArrayDescriptor:Lee/f;

    .line 92
    .line 93
    invoke-static {v0}, Lde/a;->C(Lkotlin/jvm/internal/c0;)Lce/b;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-class v1, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v1, v0}, Lde/a;->a(Lod/c;Lce/b;)Lce/b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Lce/b;->getDescriptor()Lee/f;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringArrayDescriptor:Lee/f;

    .line 112
    .line 113
    return-void
.end method

.method public static final getBooleanArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->booleanArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getCharArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->charArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDoubleArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->doubleArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getFloatArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->floatArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getIntArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getIntListDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intListDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getLongArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->longArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getStringArrayDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringArrayDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getStringArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getStringListDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringListDescriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method
