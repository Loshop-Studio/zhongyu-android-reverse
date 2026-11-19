.class public final synthetic Lz3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/crop/CropManager;

.field public final synthetic b:J

.field public final synthetic c:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/crop/CropManager;JLr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/a;->a:Lcom/zykj/blackboard/crop/CropManager;

    iput-wide p2, p0, Lz3/a;->b:J

    iput-object p4, p0, Lz3/a;->c:Lr6/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lz3/a;->b:J

    iget-object v2, p0, Lz3/a;->c:Lr6/c;

    iget-object v3, p0, Lz3/a;->a:Lcom/zykj/blackboard/crop/CropManager;

    invoke-static {v3, v0, v1, v2}, Lcom/zykj/blackboard/crop/CropManager;->a(Lcom/zykj/blackboard/crop/CropManager;JLr6/c;)V

    return-void
.end method
