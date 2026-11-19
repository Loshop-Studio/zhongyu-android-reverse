.class public final synthetic Ls6/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/c1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iput-object p2, p0, Ls6/c1;->b:Lcom/zykj/student/dialogue/ui/home/a;

    iput p3, p0, Ls6/c1;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/c1;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iget-object v1, p0, Ls6/c1;->b:Lcom/zykj/student/dialogue/ui/home/a;

    iget v2, p0, Ls6/c1;->c:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->i(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/a;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
