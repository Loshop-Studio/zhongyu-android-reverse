.class public Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/render/SketchViewer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CheckActionRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$000(Lcom/zykj/paint/render/SketchViewer;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$100(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-gt v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 28
    .line 29
    new-instance v1, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable$1;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable$1;-><init>(Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$100(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/zykj/paint/Actions$EzyAction;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    iget-object v5, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 67
    .line 68
    invoke-static {v5}, Lcom/zykj/paint/render/SketchViewer;->access$700(Lcom/zykj/paint/render/SketchViewer;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    sub-long/2addr v3, v5

    .line 73
    invoke-static {v2, v3, v4}, Lcom/zykj/paint/render/SketchViewer;->access$602(Lcom/zykj/paint/render/SketchViewer;J)J

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 77
    .line 78
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->access$600(Lcom/zykj/paint/render/SketchViewer;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    int-to-long v4, v1

    .line 83
    cmp-long v1, v2, v4

    .line 84
    .line 85
    if-ltz v1, :cond_1

    .line 86
    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string/jumbo v2, "timeRecord=["

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 99
    .line 100
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->access$600(Lcom/zykj/paint/render/SketchViewer;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v2, "]---->>>>>\u8bfb\u53d6\u7b2c["

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 113
    .line 114
    invoke-static {v2}, Lcom/zykj/paint/render/SketchViewer;->access$200(Lcom/zykj/paint/render/SketchViewer;)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v2, "]\u6761\u6307\u4ee4"

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v2, "SketchViewer"

    .line 131
    .line 132
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 136
    .line 137
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$208(Lcom/zykj/paint/render/SketchViewer;)I

    .line 138
    .line 139
    .line 140
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 141
    .line 142
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$800(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/runner/ActionProcessor;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2, v0}, Lcom/zykj/paint/runner/ActionProcessor;->addMultiAction(Lcom/zykj/paint/Actions$EzyAction;)Ljava/util/concurrent/ScheduledFuture;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v1, v0}, Lcom/zykj/paint/render/SketchViewer;->access$302(Lcom/zykj/paint/render/SketchViewer;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 151
    .line 152
    .line 153
    :cond_1
    return-void
.end method
