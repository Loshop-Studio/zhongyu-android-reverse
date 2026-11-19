.class public final synthetic La5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, La5/d;->a:I

    iput-object p1, p0, La5/d;->b:Ljava/lang/Object;

    iput-object p2, p0, La5/d;->c:Ljava/lang/Object;

    iput-object p3, p0, La5/d;->d:Ljava/lang/Object;

    iput-object p4, p0, La5/d;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, La5/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 9
    .line 10
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lcom/zykj/sketch/core/config/SketchConfig;

    .line 17
    .line 18
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lr6/c;

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->c(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 29
    .line 30
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lr6/c;

    .line 37
    .line 38
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lr6/c;

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->i(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lr6/c;Lr6/c;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcom/zykj/blackboard/core/play/PlayControl;

    .line 49
    .line 50
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lr6/c;

    .line 57
    .line 58
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Lr6/c;

    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/play/PlayControl;->b(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lr6/c;Lr6/c;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 73
    .line 74
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lr6/e;

    .line 77
    .line 78
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Lr6/c;

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;->d(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/e;Lr6/c;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_3
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 89
    .line 90
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ljava/lang/String;

    .line 93
    .line 94
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Lr6/f;

    .line 97
    .line 98
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Lr6/c;

    .line 101
    .line 102
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lr6/f;Lr6/c;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_4
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    .line 109
    .line 110
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Landroidx/camera/core/DynamicRange;

    .line 113
    .line 114
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, Ljava/util/Map;

    .line 117
    .line 118
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v3, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    .line 121
    .line 122
    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;->h(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;Landroidx/camera/core/DynamicRange;Ljava/util/Map;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_5
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    .line 129
    .line 130
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Landroidx/camera/core/DynamicRange;

    .line 133
    .line 134
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v2, Ljava/util/Map;

    .line 137
    .line 138
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v3, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    .line 141
    .line 142
    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->d(Landroidx/camera/core/processing/DefaultSurfaceProcessor;Landroidx/camera/core/DynamicRange;Ljava/util/Map;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_6
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Landroidx/camera/core/ImageCapture;

    .line 149
    .line 150
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Landroidx/camera/core/ImageCapture$OutputFileOptions;

    .line 153
    .line 154
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 157
    .line 158
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v3, Landroidx/camera/core/ImageCapture$OnImageSavedCallback;

    .line 161
    .line 162
    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/ImageCapture;->e(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_7
    iget-object v0, p0, La5/d;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, La5/e;

    .line 169
    .line 170
    iget-object v1, p0, La5/d;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Landroid/widget/DatePicker;

    .line 173
    .line 174
    iget-object v2, p0, La5/d;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Landroid/widget/DatePicker;

    .line 177
    .line 178
    iget-object v3, p0, La5/d;->e:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v3, La5/c;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, La5/e;->d(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v2}, La5/e;->d(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, La5/c;->invoke()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
