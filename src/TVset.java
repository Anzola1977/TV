public class TVset {
    private int channel = 5;
    private boolean isOn;
    protected TVset tvSet;
    class Remote {

        public void setTVset(TVset tvSet) {
            TVset.this.tvSet = tvSet;
        }

        public void setChannel(int channel) {
            TVset.this.channel = channel;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }
    }

    public String toString() {
        if (!isOn) {
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}

