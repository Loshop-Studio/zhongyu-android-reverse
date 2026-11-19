.class public final synthetic Lh3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function3;

.field public final synthetic b:Lh3/d0;

.field public final synthetic c:Lh3/c0;

.field public final synthetic d:Landroidx/navigation/NavController;

.field public final synthetic e:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Lh3/d0;Lh3/c0;Landroidx/navigation/NavController;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/l;->a:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lh3/l;->b:Lh3/d0;

    iput-object p3, p0, Lh3/l;->c:Lh3/c0;

    iput-object p4, p0, Lh3/l;->d:Landroidx/navigation/NavController;

    iput-object p5, p0, Lh3/l;->e:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lh3/l;->a:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lh3/l;->b:Lh3/d0;

    iget-object v2, p0, Lh3/l;->c:Lh3/c0;

    iget-object v3, p0, Lh3/l;->d:Landroidx/navigation/NavController;

    iget-object v4, p0, Lh3/l;->e:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3, v4}, Lh3/v;->s(Lkotlin/jvm/functions/Function3;Lh3/d0;Lh3/c0;Landroidx/navigation/NavController;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
