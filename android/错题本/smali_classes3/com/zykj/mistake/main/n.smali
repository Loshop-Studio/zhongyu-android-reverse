.class public final synthetic Lcom/zykj/mistake/main/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/zykj/mistake/main/n;->a:J

    iput-object p3, p0, Lcom/zykj/mistake/main/n;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lcom/zykj/mistake/main/a1;

    .line 2
    .line 3
    const-string v0, "state"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/zykj/mistake/main/a;

    .line 9
    .line 10
    const/16 v6, 0x18

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/zykj/mistake/main/n;->a:J

    .line 13
    .line 14
    iget-object v4, p0, Lcom/zykj/mistake/main/n;->b:Ljava/lang/String;

    .line 15
    .line 16
    move-object v5, v4

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/zykj/mistake/main/a;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, v2, v1, v0}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
