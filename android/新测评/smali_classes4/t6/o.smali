.class public final synthetic Lt6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;JLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt6/o;->a:I

    iput-object p2, p0, Lt6/o;->b:Ljava/lang/String;

    iput-wide p3, p0, Lt6/o;->c:J

    iput-object p5, p0, Lt6/o;->d:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Lt6/o;->e:I

    iput p7, p0, Lt6/o;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lt6/o;->a:I

    iget-object v1, p0, Lt6/o;->b:Ljava/lang/String;

    iget-wide v2, p0, Lt6/o;->c:J

    iget-object v4, p0, Lt6/o;->d:Lkotlin/jvm/functions/Function0;

    iget v5, p0, Lt6/o;->e:I

    iget v6, p0, Lt6/o;->f:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lt6/z;->c(ILjava/lang/String;JLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
