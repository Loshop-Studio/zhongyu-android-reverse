.class public final synthetic Lt6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lt6/m;->a:Z

    iput-object p2, p0, Lt6/m;->b:Ljava/lang/String;

    iput-wide p3, p0, Lt6/m;->c:J

    iput-wide p5, p0, Lt6/m;->d:J

    iput p7, p0, Lt6/m;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lt6/m;->a:Z

    iget-object v1, p0, Lt6/m;->b:Ljava/lang/String;

    iget-wide v2, p0, Lt6/m;->c:J

    iget-wide v4, p0, Lt6/m;->d:J

    iget v6, p0, Lt6/m;->e:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lt6/z;->l(ZLjava/lang/String;JJILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
