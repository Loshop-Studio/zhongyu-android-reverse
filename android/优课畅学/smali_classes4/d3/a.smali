.class public final synthetic Ld3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/crop/CropManager;

.field public final synthetic b:J

.field public final synthetic c:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/crop/CropManager;JLx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/a;->a:Lcom/zykj/blackboard/crop/CropManager;

    iput-wide p2, p0, Ld3/a;->b:J

    iput-object p4, p0, Ld3/a;->c:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld3/a;->a:Lcom/zykj/blackboard/crop/CropManager;

    iget-wide v1, p0, Ld3/a;->b:J

    iget-object v3, p0, Ld3/a;->c:Lx7/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/crop/CropManager;->a(Lcom/zykj/blackboard/crop/CropManager;JLx7/l;)V

    return-void
.end method
