.class public final synthetic Le6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlin/jvm/functions/Function6;

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

.field public final synthetic f:Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le6/f;->a:J

    iput-object p3, p0, Le6/f;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p4, p0, Le6/f;->c:Landroidx/navigation/NavController;

    iput-object p5, p0, Le6/f;->d:Lkotlin/jvm/functions/Function6;

    iput-object p6, p0, Le6/f;->e:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iput-object p7, p0, Le6/f;->f:Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;

    iput p8, p0, Le6/f;->g:I

    iput p9, p0, Le6/f;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-wide v0, p0, Le6/f;->a:J

    iget-object v2, p0, Le6/f;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v3, p0, Le6/f;->c:Landroidx/navigation/NavController;

    iget-object v4, p0, Le6/f;->d:Lkotlin/jvm/functions/Function6;

    iget-object v5, p0, Le6/f;->e:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iget-object v6, p0, Le6/f;->f:Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;

    iget v7, p0, Le6/f;->g:I

    iget v8, p0, Le6/f;->h:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->d(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
