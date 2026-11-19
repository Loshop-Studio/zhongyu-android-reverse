.class public final synthetic Ls6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/a;

.field public final synthetic b:Ls6/l0;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/a;Ls6/l0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/q;->a:Lcom/zykj/student/dialogue/ui/home/a;

    iput-object p2, p0, Ls6/q;->b:Ls6/l0;

    iput-boolean p3, p0, Ls6/q;->c:Z

    iput-object p4, p0, Ls6/q;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Ls6/q;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ls6/q;->f:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Ls6/q;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Ls6/q;->a:Lcom/zykj/student/dialogue/ui/home/a;

    iget-object v1, p0, Ls6/q;->b:Ls6/l0;

    iget-boolean v2, p0, Ls6/q;->c:Z

    iget-object v3, p0, Ls6/q;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Ls6/q;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ls6/q;->f:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Ls6/q;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt;->l(Lcom/zykj/student/dialogue/ui/home/a;Ls6/l0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
