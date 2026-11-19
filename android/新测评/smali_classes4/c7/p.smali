.class public final synthetic Lc7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/p;->a:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lc7/p;->b:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc7/p;->a:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lc7/p;->b:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1}, Lc7/r;->e(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
