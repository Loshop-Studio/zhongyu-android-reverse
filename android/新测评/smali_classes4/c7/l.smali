.class public final synthetic Lc7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lc7/c;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lc7/c;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/l;->a:Lc7/c;

    iput-object p2, p0, Lc7/l;->b:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc7/l;->a:Lc7/c;

    iget-object v1, p0, Lc7/l;->b:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lc7/r;->b(Lc7/c;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
