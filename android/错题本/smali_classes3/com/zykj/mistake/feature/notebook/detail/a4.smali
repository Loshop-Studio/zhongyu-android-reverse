.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->a:J

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lp4/e;

    .line 3
    .line 4
    const-string p1, "it"

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/16 v8, 0x3c1

    .line 10
    .line 11
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->a:J

    .line 12
    .line 13
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->d:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/a4;->e:Ljava/util/ArrayList;

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    invoke-static/range {v0 .. v8}, Lp4/e;->a(Lp4/e;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Lp4/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
