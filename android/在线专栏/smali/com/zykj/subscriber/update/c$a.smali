.class Lcom/zykj/subscriber/update/c$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/update/c;->j(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/zykj/subscriber/update/c;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/update/c;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/update/c$a;->c:Lcom/zykj/subscriber/update/c;

    iput-object p2, p0, Lcom/zykj/subscriber/update/c$a;->a:Ljava/lang/String;

    iput p3, p0, Lcom/zykj/subscriber/update/c$a;->b:I

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/zykj/subscriber/update/c$a;->c:Lcom/zykj/subscriber/update/c;

    iget-object v1, p0, Lcom/zykj/subscriber/update/c$a;->a:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/subscriber/update/c$a;->b:I

    invoke-static {v0, v1, v2}, Lcom/zykj/subscriber/update/c;->d(Lcom/zykj/subscriber/update/c;Ljava/lang/String;I)V

    return-void
.end method
