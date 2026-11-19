.class public Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

.field public b:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

.field public c:Lcom/xuexiang/xui/widget/imageview/edit/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;)V
    .locals 10

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v2, -0x1

    .line 24
    const/4 v3, -0x2

    .line 25
    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    const/16 v4, 0xd

    .line 29
    .line 30
    invoke-virtual {v0, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    sget-object v6, Lcom/xuexiang/xui/R$styleable;->PhotoEditorView:[I

    .line 40
    .line 41
    invoke-virtual {v5, p1, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget v5, Lcom/xuexiang/xui/R$styleable;->PhotoEditorView_photo_src:I

    .line 46
    .line 47
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    .line 54
    .line 55
    invoke-virtual {v5, p1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-direct {p1, v5}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->b:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    .line 68
    .line 69
    const/16 v5, 0x8

    .line 70
    .line 71
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->b:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 81
    .line 82
    invoke-direct {p1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 86
    .line 87
    .line 88
    const/4 v7, 0x6

    .line 89
    invoke-virtual {p1, v7, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 93
    .line 94
    .line 95
    new-instance v8, Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-direct {v8, v9}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    new-array v9, v6, [I

    .line 105
    .line 106
    iput-object v9, v8, Lcom/xuexiang/xui/widget/imageview/edit/d;->a:[I

    .line 107
    .line 108
    new-instance v9, Lcom/xuexiang/xui/widget/imageview/edit/f;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v9, v8, Lcom/xuexiang/xui/widget/imageview/edit/d;->d:Lcom/xuexiang/xui/widget/imageview/edit/f;

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/imageview/edit/d;->g:Z

    .line 117
    .line 118
    invoke-virtual {v8, v6}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8, v8}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v9}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 125
    .line 126
    .line 127
    sget-object v6, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->NONE:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 128
    .line 129
    iput-object v6, v8, Lcom/xuexiang/xui/widget/imageview/edit/d;->h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 130
    .line 131
    invoke-virtual {v8}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 132
    .line 133
    .line 134
    iput-object v8, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 135
    .line 136
    const/4 v6, 0x3

    .line 137
    invoke-virtual {v8, v6}, Landroid/view/View;->setId(I)V

    .line 138
    .line 139
    .line 140
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 141
    .line 142
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 143
    .line 144
    .line 145
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 146
    .line 147
    invoke-direct {v6, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v7, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    .line 160
    .line 161
    new-instance v2, Lo2/a;

    .line 162
    .line 163
    const/16 v3, 0x9

    .line 164
    .line 165
    invoke-direct {v2, p0, v3}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    iput-object v2, v1, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->a:Lo2/a;

    .line 169
    .line 170
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 174
    .line 175
    invoke-virtual {p0, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->b:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    .line 179
    .line 180
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public getBrushDrawingView()Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->b:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSource()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 3
    iput-object v2, v0, Lcom/xuexiang/xui/widget/imageview/edit/d;->i:Landroid/graphics/Bitmap;

    .line 4
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/d;->g:Z

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 6
    iput-object p1, v0, Lcom/xuexiang/xui/widget/imageview/edit/d;->h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 7
    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void
.end method

.method public setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/b;)V
    .locals 2

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->a:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 10
    iput-object v1, p1, Lcom/xuexiang/xui/widget/imageview/edit/d;->i:Landroid/graphics/Bitmap;

    .line 11
    iput-boolean v0, p1, Lcom/xuexiang/xui/widget/imageview/edit/d;->g:Z

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 13
    invoke-virtual {p1}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void
.end method
