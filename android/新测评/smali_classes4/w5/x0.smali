.class public final synthetic Lw5/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Landroidx/compose/ui/text/AnnotatedString;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/x0;->a:Ljava/lang/String;

    iput-object p2, p0, Lw5/x0;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lw5/x0;->c:Landroidx/compose/ui/text/AnnotatedString;

    iput-object p4, p0, Lw5/x0;->d:Ljava/lang/String;

    iput-object p5, p0, Lw5/x0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lw5/x0;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lw5/x0;->g:Lkotlin/jvm/functions/Function0;

    iput p8, p0, Lw5/x0;->h:I

    iput p9, p0, Lw5/x0;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lw5/x0;->a:Ljava/lang/String;

    iget-object v1, p0, Lw5/x0;->b:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lw5/x0;->c:Landroidx/compose/ui/text/AnnotatedString;

    iget-object v3, p0, Lw5/x0;->d:Ljava/lang/String;

    iget-object v4, p0, Lw5/x0;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lw5/x0;->f:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lw5/x0;->g:Lkotlin/jvm/functions/Function0;

    iget v7, p0, Lw5/x0;->h:I

    iget v8, p0, Lw5/x0;->i:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->B(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
