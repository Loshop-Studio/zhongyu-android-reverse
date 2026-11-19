.class public final synthetic Ls6/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

.field public final synthetic b:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/e1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iput-object p2, p0, Ls6/e1;->b:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/e1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iget-object v1, p0, Ls6/e1;->b:Landroidx/compose/runtime/State;

    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->u(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Landroidx/compose/runtime/State;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
