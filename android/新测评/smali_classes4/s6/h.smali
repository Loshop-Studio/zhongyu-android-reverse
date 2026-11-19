.class public final synthetic Ls6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/h;->a:Ljava/lang/String;

    iput-object p2, p0, Ls6/h;->b:Ljava/util/List;

    iput-object p3, p0, Ls6/h;->c:Ljava/util/List;

    iput-object p4, p0, Ls6/h;->d:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Ls6/h;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ls6/h;->a:Ljava/lang/String;

    iget-object v1, p0, Ls6/h;->b:Ljava/util/List;

    iget-object v2, p0, Ls6/h;->c:Ljava/util/List;

    iget-object v3, p0, Ls6/h;->d:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Ls6/h;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/home/d;->f(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
