.class public final synthetic Ls6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/s;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ls6/s;->b:Ljava/lang/Object;

    iput-object p3, p0, Ls6/s;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    iput-object p4, p0, Ls6/s;->d:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Ls6/s;->e:I

    iput p6, p0, Ls6/s;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Ls6/s;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ls6/s;->b:Ljava/lang/Object;

    iget-object v2, p0, Ls6/s;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    iget-object v3, p0, Ls6/s;->d:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Ls6/s;->e:I

    iget v5, p0, Ls6/s;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/student/dialogue/ui/home/DrawerContentKt;->i(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
