.class public final synthetic Lt6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJJLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/q;->a:Ljava/lang/String;

    iput-wide p2, p0, Lt6/q;->b:J

    iput-wide p4, p0, Lt6/q;->c:J

    iput-wide p6, p0, Lt6/q;->d:J

    iput-object p8, p0, Lt6/q;->e:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lt6/q;->f:I

    iput p10, p0, Lt6/q;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lt6/q;->a:Ljava/lang/String;

    iget-wide v1, p0, Lt6/q;->b:J

    iget-wide v3, p0, Lt6/q;->c:J

    iget-wide v5, p0, Lt6/q;->d:J

    iget-object v7, p0, Lt6/q;->e:Lkotlin/jvm/functions/Function0;

    iget v8, p0, Lt6/q;->f:I

    iget v9, p0, Lt6/q;->g:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lt6/z;->w(Ljava/lang/String;JJJLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
