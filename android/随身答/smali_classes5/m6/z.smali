.class public final synthetic Lm6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/student/dialogue/bean/resp/CourseItem;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/CourseItem;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/z;->a:Ljava/util/List;

    iput-object p2, p0, Lm6/z;->b:Lcom/zykj/student/dialogue/bean/resp/CourseItem;

    iput-object p3, p0, Lm6/z;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lm6/z;->a:Ljava/util/List;

    iget-object v1, p0, Lm6/z;->b:Lcom/zykj/student/dialogue/bean/resp/CourseItem;

    iget-object v2, p0, Lm6/z;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-static {v0, v1, v2, p1}, Lm6/d0;->k(Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/CourseItem;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/grid/LazyGridScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
