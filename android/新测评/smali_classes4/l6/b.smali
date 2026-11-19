.class public final synthetic Ll6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/b;->a:Landroidx/navigation/NavController;

    iput-wide p2, p0, Ll6/b;->b:J

    iput-boolean p4, p0, Ll6/b;->c:Z

    iput-object p5, p0, Ll6/b;->d:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iput p6, p0, Ll6/b;->e:I

    iput p7, p0, Ll6/b;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Ll6/b;->a:Landroidx/navigation/NavController;

    iget-wide v1, p0, Ll6/b;->b:J

    iget-boolean v3, p0, Ll6/b;->c:Z

    iget-object v4, p0, Ll6/b;->d:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iget v5, p0, Ll6/b;->e:I

    iget v6, p0, Ll6/b;->f:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt;->a(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
