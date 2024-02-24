package Logica;

import javax.swing.JOptionPane;

public class cls_operacion {

    private float numero1Flt;
    private float numero2Flt;
    private int operacionInt;
    private float resultadoFlt;

    public cls_operacion(float numero1Flt, float numero2Flt, int operacionInt) {
        this.numero1Flt = numero1Flt;
        this.numero2Flt = numero2Flt;
        this.operacionInt = operacionInt;

        switch (operacionInt) {

            case 0:
                this.resultadoFlt = numero1Flt + numero2Flt;
                break;

            case 1:
                this.resultadoFlt = numero1Flt - numero2Flt;
                break;

            case 2:
                this.resultadoFlt = numero1Flt * numero2Flt;
                break;

            case 3:
                if (numero2Flt == 0) {
                    JOptionPane.showMessageDialog(null, "Error");
                } else {
                    this.resultadoFlt = numero1Flt / numero2Flt;
                }
                break;

            default:
                break;
        }

    }

    public float getResultadoFlt() {
        return resultadoFlt;
    }

}