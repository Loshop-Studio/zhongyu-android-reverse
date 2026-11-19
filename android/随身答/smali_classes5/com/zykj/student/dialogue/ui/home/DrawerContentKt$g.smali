.class public final Lcom/zykj/student/dialogue/ui/home/DrawerContentKt$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/DrawerContentKt;->p(Lcom/zykj/student/dialogue/ui/home/a;Ls6/l0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/student/dialogue/ui/home/a;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt$g;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt$g;->b:Lcom/zykj/student/dialogue/ui/home/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt$g;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt$g;->b:Lcom/zykj/student/dialogue/ui/home/a;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt$g;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object v0
.end method
