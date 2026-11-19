.class public final Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0017\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u000c\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0002\u001a\u0004\u0008\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0002\u001a\u0004\u0008\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0002\u001a\u0004\u0008\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0002\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0004\u00a8\u0006\u0017"
    }
    d2 = {
        "Lk7/g;",
        "intListDescriptor",
        "Lk7/g;",
        "getIntListDescriptor",
        "()Lk7/g;",
        "stringListDescriptor",
        "getStringListDescriptor",
        "booleanArrayDescriptor",
        "getBooleanArrayDescriptor",
        "charArrayDescriptor",
        "getCharArrayDescriptor",
        "doubleArrayDescriptor",
        "getDoubleArrayDescriptor",
        "floatArrayDescriptor",
        "getFloatArrayDescriptor",
        "intArrayDescriptor",
        "getIntArrayDescriptor",
        "longArrayDescriptor",
        "getLongArrayDescriptor",
        "stringArrayDescriptor",
        "getStringArrayDescriptor",
        "getStringArrayDescriptor$annotations",
        "()V",
        "savedstate_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSavedStateCodecUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,41:1\n194#2:42\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n*L\n40#1:42\n*E\n"
    }
.end annotation


# static fields
.field private static final booleanArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final charArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final doubleArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final floatArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final intArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final intListDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final longArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final stringArrayDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final stringListDescriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lm7/j0;->a:Lm7/j0;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/u;->c(Li7/b;)Lm7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lm7/d;->c:Lm7/l0;

    .line 8
    .line 9
    check-cast v0, Lm7/c;

    .line 10
    .line 11
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intListDescriptor:Lk7/g;

    .line 12
    .line 13
    sget-object v0, Lm7/m1;->a:Lm7/m1;

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/collections/u;->c(Li7/b;)Lm7/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v1, v1, Lm7/d;->c:Lm7/l0;

    .line 20
    .line 21
    check-cast v1, Lm7/c;

    .line 22
    .line 23
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringListDescriptor:Lk7/g;

    .line 24
    .line 25
    sget-object v1, Lm7/f;->c:Lm7/f;

    .line 26
    .line 27
    iget-object v1, v1, Lm7/d1;->b:Lm7/c1;

    .line 28
    .line 29
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->booleanArrayDescriptor:Lk7/g;

    .line 30
    .line 31
    sget-object v1, Lm7/o;->c:Lm7/o;

    .line 32
    .line 33
    iget-object v1, v1, Lm7/d1;->b:Lm7/c1;

    .line 34
    .line 35
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->charArrayDescriptor:Lk7/g;

    .line 36
    .line 37
    sget-object v1, Lm7/t;->c:Lm7/t;

    .line 38
    .line 39
    iget-object v1, v1, Lm7/d1;->b:Lm7/c1;

    .line 40
    .line 41
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->doubleArrayDescriptor:Lk7/g;

    .line 42
    .line 43
    sget-object v1, Lm7/a0;->c:Lm7/a0;

    .line 44
    .line 45
    iget-object v1, v1, Lm7/d1;->b:Lm7/c1;

    .line 46
    .line 47
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->floatArrayDescriptor:Lk7/g;

    .line 48
    .line 49
    sget-object v1, Lm7/i0;->c:Lm7/i0;

    .line 50
    .line 51
    iget-object v1, v1, Lm7/d1;->b:Lm7/c1;

    .line 52
    .line 53
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intArrayDescriptor:Lk7/g;

    .line 54
    .line 55
    sget-object v1, Lm7/n0;->c:Lm7/n0;

    .line 56
    .line 57
    iget-object v1, v1, Lm7/d1;->b:Lm7/c1;

    .line 58
    .line 59
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->longArrayDescriptor:Lk7/g;

    .line 60
    .line 61
    const-class v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1, v0}, Lkotlin/collections/u;->a(Ly6/c;Li7/b;)Lm7/g1;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, Lm7/g1;->c:Lm7/c;

    .line 72
    .line 73
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringArrayDescriptor:Lk7/g;

    .line 74
    .line 75
    return-void
.end method

.method public static final getBooleanArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->booleanArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getCharArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->charArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDoubleArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->doubleArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getFloatArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->floatArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getIntArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getIntListDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->intListDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getLongArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->longArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getStringArrayDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringArrayDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getStringArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getStringListDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtilsKt;->stringListDescriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method
