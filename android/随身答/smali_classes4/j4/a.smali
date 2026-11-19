.class public Lj4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Landroid/view/ViewGroup;

.field public B:I

.field public C:Landroid/content/Context;

.field public D:Ljava/lang/String;

.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:F

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Landroid/graphics/Typeface;

.field public X:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field public a:Lk4/c;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:[Z

.field public g:Ljava/util/Calendar;

.field public h:Ljava/util/Calendar;

.field public i:Ljava/util/Calendar;

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lj4/a;->b:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lj4/a;->c:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lj4/a;->d:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lj4/a;->e:Z

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    new-array v1, v1, [Z

    .line 15
    .line 16
    fill-array-data v1, :array_0

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lj4/a;->f:[Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lj4/a;->l:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lj4/a;->m:Z

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    iput v1, p0, Lj4/a;->B:I

    .line 28
    .line 29
    const v2, -0xfa8201

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lj4/a;->G:I

    .line 33
    .line 34
    iput v2, p0, Lj4/a;->H:I

    .line 35
    .line 36
    const/high16 v2, -0x1000000

    .line 37
    .line 38
    iput v2, p0, Lj4/a;->I:I

    .line 39
    .line 40
    const/4 v2, -0x1

    .line 41
    iput v2, p0, Lj4/a;->J:I

    .line 42
    .line 43
    const v3, -0xa0a0b

    .line 44
    .line 45
    .line 46
    iput v3, p0, Lj4/a;->K:I

    .line 47
    .line 48
    iput v1, p0, Lj4/a;->L:I

    .line 49
    .line 50
    const/16 v1, 0x12

    .line 51
    .line 52
    iput v1, p0, Lj4/a;->M:I

    .line 53
    .line 54
    iput v1, p0, Lj4/a;->N:I

    .line 55
    .line 56
    const v1, -0x575758

    .line 57
    .line 58
    .line 59
    iput v1, p0, Lj4/a;->O:I

    .line 60
    .line 61
    const v1, -0xd5d5d6

    .line 62
    .line 63
    .line 64
    iput v1, p0, Lj4/a;->P:I

    .line 65
    .line 66
    const v1, -0x2a2a2b

    .line 67
    .line 68
    .line 69
    iput v1, p0, Lj4/a;->Q:I

    .line 70
    .line 71
    iput v2, p0, Lj4/a;->R:I

    .line 72
    .line 73
    const v1, 0x3fcccccd    # 1.6f

    .line 74
    .line 75
    .line 76
    iput v1, p0, Lj4/a;->S:F

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    iput-boolean v1, p0, Lj4/a;->U:Z

    .line 80
    .line 81
    iput-boolean v0, p0, Lj4/a;->V:Z

    .line 82
    .line 83
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 84
    .line 85
    iput-object v0, p0, Lj4/a;->W:Landroid/graphics/Typeface;

    .line 86
    .line 87
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 88
    .line 89
    iput-object v0, p0, Lj4/a;->X:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 90
    .line 91
    if-ne p1, v1, :cond_0

    .line 92
    .line 93
    sget p1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_options:I

    .line 94
    .line 95
    iput p1, p0, Lj4/a;->z:I

    .line 96
    .line 97
    return-void

    .line 98
    :cond_0
    sget p1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_time:I

    .line 99
    .line 100
    iput p1, p0, Lj4/a;->z:I

    .line 101
    .line 102
    return-void

    .line 103
    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method
