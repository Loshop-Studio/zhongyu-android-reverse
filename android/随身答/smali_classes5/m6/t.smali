.class public final synthetic Lm6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/student/dialogue/bean/resp/CourseItem;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/student/dialogue/bean/resp/CourseItem;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm6/t;->a:Z

    iput-object p2, p0, Lm6/t;->b:Lcom/zykj/student/dialogue/bean/resp/CourseItem;

    iput-object p3, p0, Lm6/t;->c:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lm6/t;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lm6/t;->a:Z

    iget-object v1, p0, Lm6/t;->b:Lcom/zykj/student/dialogue/bean/resp/CourseItem;

    iget-object v2, p0, Lm6/t;->c:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lm6/t;->d:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lm6/d0;->h(ZLcom/zykj/student/dialogue/bean/resp/CourseItem;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
