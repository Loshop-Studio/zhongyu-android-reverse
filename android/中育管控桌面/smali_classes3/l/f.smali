.class public abstract Ll/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/runtime/ProvidableCompositionLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ll/e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ll/f;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a()Ll/a;
    .locals 1

    .line 1
    invoke-static {}, Ll/f;->b()Ll/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Ll/a;
    .locals 1

    .line 1
    sget-object v0, Ll/a;->b:Ll/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final c()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1

    .line 1
    sget-object v0, Ll/f;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 2
    .line 3
    return-object v0
.end method
