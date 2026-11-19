.class public final synthetic Lz5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/h;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lz5/h;->b:Z

    iput-object p3, p0, Lz5/h;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lz5/h;->d:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lz5/h;->e:I

    iput p6, p0, Lz5/h;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lz5/h;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lz5/h;->b:Z

    iget-object v2, p0, Lz5/h;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lz5/h;->d:Lkotlin/jvm/functions/Function0;

    iget v4, p0, Lz5/h;->e:I

    iget v5, p0, Lz5/h;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lz5/r;->h(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
